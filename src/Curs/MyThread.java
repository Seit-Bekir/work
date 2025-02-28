package Curs;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println("helo from my thread "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
