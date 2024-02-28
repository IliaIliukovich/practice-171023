package lesson20240226;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class TopKTask {

    public static void main(String[] args) {
        List<Item> itemList = Arrays.asList(new Item("A", 3),
                new Item("B", 1),
                new Item("C", 5),
                new Item("D", 2),
                new Item("E", 2),
                new Item("F", 0));

        // solution by sort ---> O(nlog(n) + k)
        // solution with priority queue ----->  O(n * log k)

        List<Item> topItems = getTopK(itemList, 2);
        System.out.println(topItems);
    }

    private static List<Item> getTopK(List<Item> itemList, int k) { // O(n * log k)
        ItemMaxPriceComparator comparator = new ItemMaxPriceComparator();
        PriorityQueue<Item> priorityQueue = new PriorityQueue<>(k, comparator); // O(k) max heap

        int i = 0;
        while (i++ < k) { // O(k log k)
            priorityQueue.add(itemList.get(i));
        }

        while (i++ < itemList.size() - 1) {  // (n - k)*log(k)
            Item top = priorityQueue.peek();
            Item current = itemList.get(i);
            if (
                    comparator.compare(top, current) < 0
//                    top.compareTo(current) < 0
            ) {
                priorityQueue.remove();
                priorityQueue.add(current);
            }
        }

        return priorityQueue.stream().toList(); // O(k log k)
    }


}
