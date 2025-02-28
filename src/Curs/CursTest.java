package Curs;

import javax.swing.plaf.basic.BasicBorders;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

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

    public  void addToList1() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       synchronized (lock1){ list1.add(random.nextInt());}
    }

    public  void addToList2() {
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
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        long after = System.currentTimeMillis();
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
