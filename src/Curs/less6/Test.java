package Curs.less6;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;


public class Test {


    public static void main(String[] args) {

        ProduceConsumer pc = new ProduceConsumer();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                pc.consume();
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

}

class ProduceConsumer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int limit = 10;
    private final Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (lock) {
                while (queue.size() == limit) {
                    lock.wait();
                }
                queue.offer(value++);
            }
        }
    }

    public void consume() {
        while (true) {
            synchronized (lock) {
               int value = queue.poll();
                System.out.println(value);
            }
        }

    }
}
