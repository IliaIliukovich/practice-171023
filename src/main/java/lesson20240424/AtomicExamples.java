package lesson20240424;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExamples {
     static AtomicInteger integer = new AtomicInteger(0);

    public static void main(String[] args) {
//        integer.addAndGet(2);

        new Thread(new Task()).start();
        new Thread(new Task()).start();

    }

    static class Task implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                boolean success = false;
                do {
                    int old = integer.get();
                    int tmp = old + 1;
                    success = integer.compareAndSet(old, tmp);
                    System.out.println(tmp);
                    if (!success) System.out.println("loop");
                } while (!success);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
