package lesson20240422;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class CustomStack {

    private LinkedList<String> list = new LinkedList<>();

//    private Object lock = new String("LOCK");
//    private Object lock = "LOCK";
    private Object lock = new Object();

    public void push(String element) {
        synchronized (lock) {
            list.addFirst(element);
            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String pop() {
        synchronized (lock) {
            return list.removeFirst();
        }
    }

    public static void main(String[] args) {
        CustomStack stack1 = new CustomStack();
        new Thread(() -> stack1.push("A")).start();
        new Thread(() -> stack1.push("B")).start();

        CustomStack stack2 = new CustomStack();
        new Thread(() -> stack2.push("C")).start();


        for (int i = 0; i < 30; i++){
            System.out.println("stack 1 size: " + stack1.list.size());
            System.out.println("stack 2 size: " + stack2.list.size());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        try {
            // some action
            System.out.println(1 / 0);
        } finally {
            reentrantLock.unlock();
        }

    }


}
