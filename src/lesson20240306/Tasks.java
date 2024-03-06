package lesson20240306;

import lesson20240228.Task3;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Tasks {

    public static void main(String[] args) {

        // Task 1
        // version 1 better solution
        Random random = new Random();
        Supplier<Integer> generation = random::nextInt;
        System.out.println(generation.get());
        // version 2
        generation = () -> new Random().nextInt();
        System.out.println(generation.get());

        // Task 2
        BiFunction<Integer, Integer, Integer> p = (o1, o2) -> Task3.power(o1, o2);
        BinaryOperator<Integer> power = Task3::power; // Math.power()
        System.out.println(power.apply(2, 10));

        // 4. Посчитать количество неповторяющихся слов в списке
        List<String> list2 = List.of("One","One","Three","Four","Five","Four","Seven");
        System.out.println(list2.stream().distinct().count());

        //5. Посчитать количество людей с именем "Tom" в списке имен
        list2.stream().filter(s -> s.equals("Tom")).count();

        //6. Из списка имен вывести первое по алфавиту
        String name = list2.stream().min(String::compareTo).get();
        Optional<String> data = list2.stream().sorted().findFirst();
        String result = data.orElse("Some other string");

        //7. Посчитать количество чисел от 1 до 1000, которые делятся на 7.
        long count = IntStream.rangeClosed(1, 1000).filter(value -> value % 7 == 0).count();
        long sum = IntStream.rangeClosed(1, 20).boxed().filter(value -> value % 7 == 0).reduce((i, j) -> i + j).get();
        System.out.println(sum);

        //8. Посчитать сумму квадратов чисел от 1 до 10
        sum = IntStream.rangeClosed(1, 10).map(i -> i * i).sum();
        System.out.println(sum);
        sum = IntStream.rangeClosed(1, 10).reduce(0, (i, j) -> i + j * j);
        System.out.println(sum);

        //9. Дан список слов "Specific" "Measurable" "Achievable" "Relevant" "Time-bound".
        //С помощью стримов вывести его аббревиатуру в виде S.M.A.R.T.
        List<String> specific = List.of("Specific", "Measurable", "Achievable", "Relevant", "Time-bound");
        result = specific.stream().map(s -> s.charAt(0) + ".").reduce(String::concat).get();
        System.out.println(result);
        result = specific.stream().map(s -> s.substring(0, 1)).reduce((c1, c2) -> c1 + "." + c2).get();
        System.out.println(result);

    }

}
