package lesson20240226;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Task2 {

    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Deque<Integer> reverseQueue = new ArrayDeque<>();
        for (Integer i : queue) {
            reverseQueue.addFirst(i);
        }
        return reverseQueue;
    }


    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        Queue<Integer> reversedQueue = reverseQueue(queue);
        System.out.println(reversedQueue);
    }


}
