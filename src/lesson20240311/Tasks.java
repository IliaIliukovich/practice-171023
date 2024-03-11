package lesson20240311;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tasks {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 2, "black", true);
        Cat cat2 = new Cat("Mikky", 1, "white", false);
        Cat cat3 = new Cat("Vasya", 3, "white", true);
        Cat cat4 = new Cat("Steve", 1, "grey", false);
        Cat cat5 = new Cat("Bob", 2, "black", true);
        List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat5);

        feed(catList);
        System.out.println(catList);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(getSumWithStream(integers));

        Map<Boolean, List<Integer>> map = getMapWithStream();
        System.out.println(map);
    }

    public static void feed(List<Cat> catList) {
        for (int i = 0; i < catList.size(); i++) {
            if (catList.get(i).isHungry()) {
                catList.get(i).setHungry(false);
            }
        }
    }

    public static void feedWithStream(List<Cat> catList) {
        catList.stream().filter(Cat::isHungry).forEach(cat -> cat.setHungry(false));
//        catList.forEach(cat -> cat.setHungry(false));
    }


    public static int getSum(List<Integer> integers) {
        int oddSum = 0;
        for(Integer i: integers) {
            if(i % 2 != 0) {
                oddSum += i;
            }
        }
        return oddSum;
    }

    public static int getSumWithStream(List<Integer> integers) {
//        return integers.stream().filter(i -> i % 2 == 1).mapToInt(i -> i).sum();
        return integers.stream().filter(i -> i % 2 == 1).reduce(0, Integer::sum);
    }

    public static Map<Boolean, List<Integer>> getMap() {
        Map<Boolean, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                if (map.containsKey(true)) {
                    map.get(true).add(i);
                } else {
                    map.put(true, new ArrayList<>());
                    map.get(true).add(i);
                }
            } else {
                if (map.containsKey(false)) {
                    map.get(false).add(i);
                } else {
                    map.put(false, new ArrayList<>());
                    map.get(false).add(i);
                }
            }
        }
        return map;
    }

    public static Map<Boolean, List<Integer>> getMapWithStream() {
//        return IntStream.range(0, 100).boxed().collect(Collectors.groupingBy(i -> (i % 3) == 0, Collectors.mapping(i -> i, Collectors.toList())));
        return IntStream.range(0, 100).boxed().collect(Collectors.partitioningBy(i -> (i % 3) == 0));
    }

}
