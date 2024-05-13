package lesson20240311;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {
        List<String> list = IntStream.rangeClosed(1, 10)
//                .boxed()
                .mapToObj(value -> String.valueOf(value))
                .toList();

        System.out.println(list.get(0).getClass().getSimpleName());

        IntStream.rangeClosed(1, 1000).map(i -> (byte) i).forEach(value -> System.out.println(value));


        System.out.println("Text 1");
        Stream<String> stringStream = Stream.of("A", "B", "C");
        System.out.println("Text 2");
        Stream<String> stringStream2 = stringStream.map(s -> s + "---").peek(s -> System.out.println("Text 3")); // function definition
        System.out.println("Text 4");
        List<String> result = stringStream2.toList(); // function stated to work
        System.out.println("Text 5");

        // 1 2 4 3 3 3 5
    }



}
