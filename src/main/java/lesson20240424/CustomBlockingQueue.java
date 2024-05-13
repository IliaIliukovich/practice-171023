package lesson20240424;

import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CustomBlockingQueue<T> {

    private final LinkedList<T> list = new LinkedList<>();

    public synchronized void put(T t) {
        list.addLast(t);
        this.notify();
    }

    public synchronized T take() {
        while (list.isEmpty()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return list.removeFirst();
    }

    static class Producer implements Runnable {

        private CustomBlockingQueue<String> queue;

        public Producer(CustomBlockingQueue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {

            for (int i = 0; i < 5; i++) {
                queue.put(Thread.currentThread().getName() + " input " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    static class Consumer implements Runnable{
        private CustomBlockingQueue<String> queue;

        public Consumer(CustomBlockingQueue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                String data = queue.take();
                System.out.println(Thread.currentThread().getName() + " consumer at work with: " + data);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignore) {
                }
            }
        }
    }

    public static void main(String[] args) {
        CustomBlockingQueue<String> queue = new CustomBlockingQueue<>();
        Producer producer = new Producer(queue);
//        Producer producer2 = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        Consumer consumer2 = new Consumer(queue);

        new Thread(producer).start();
//        new Thread(producer2).start();
        new Thread(consumer).start();
        new Thread(consumer2).start();
    }





}
