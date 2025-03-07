package Curs;

import javax.swing.plaf.basic.BasicBorders;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class CursTest {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
    }

}

class Worker {
    Random random = new Random();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
    Object lock1 = new Object();
    Object lock2 = new Object();

    public synchronized   void addToList1() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       synchronized (lock1){
            list1.add(random.nextInt());
        }
    }

    public   void addToList2() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (lock2){
            list2.add(random.nextInt());
        }
    }

    public void main() throws InterruptedException {

        long befor = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 2; i++) {
            executorService.submit(thread1);

        }
        executorService.shutdown();
       //while (true){if(executorService.isTerminated())break;}
//        executorService.awaitTermination(100, TimeUnit.SECONDS);

//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
        executorService.awaitTermination(1,TimeUnit.DAYS);
        long after = System.currentTimeMillis();

        // executorService.awaitTermination(10,TimeUnit.SECONDS);
        System.out.println("program took " + (after - befor) + "ms");
        System.out.println("list1 do: " + list1.size());
        System.out.println("list2 do: " + list2.size());

    }

    public  void work() {
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }
}
