package Curs.less6;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class FxTest {
    private static ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                produce();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                consumer();
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void produce() {
        Random random = new Random();
        while (true) {
            try {
                queue.put(random.nextInt(100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private static void consumer() {
        try {
            Random random = new Random();
            while (true) {
                Thread.sleep(100);
              if(random.nextInt(100)==5){

                  System.out.println(queue.take());
                  System.out.println("Queue size: " + queue.size());
              }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}