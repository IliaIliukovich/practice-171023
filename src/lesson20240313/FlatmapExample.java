package lesson20240313;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatmapExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("One", "Two", "Three", "Four");
        list.stream().flatMap(s -> s.chars().boxed())
                .map(Character::toString)
                .map(String::toLowerCase)
                .distinct()
                .forEach(System.out::println);


        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        // task 1
        list1.stream().flatMap(i -> list2.stream().map(j -> j + i)).distinct().forEach(System.out::println);
        // task 2
        list1.stream().flatMap(i -> list2.stream().map(j -> Arrays.asList(i, j))).forEach(System.out::println);
        // task 3
        int sum = 6;
        list1.stream().flatMap(i -> list2.stream().filter(j -> i + j == sum).map(j -> Arrays.asList(i, j))).forEach(System.out::println);

        // Pythagorean triples
        IntStream.rangeClosed(1, 100).boxed().flatMap(a -> IntStream.rangeClosed(a, 100)
                .filter(b -> (Math.sqrt(a * a + b * b) % 1 == 0) )
                .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b) }))
                .forEach(ints -> System.out.println(Arrays.toString(ints)));
    }



}
