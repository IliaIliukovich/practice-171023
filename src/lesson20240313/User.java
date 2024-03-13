package lesson20240313;

import javax.naming.ldap.UnsolicitedNotification;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("user1", 32),
                new User("user2", 65),
                new User("user3", 23),
                new User("user4", 43),
                new User("user5", 10),
                new User("user6", 42),
                new User("user7", 12)
        );

        List<User> filteredAndSorted = users.stream().filter(user -> user.age >= 18)
                .sorted(
                        (o1, o2) -> o1.age - o2.age
//                        Comparator.comparingInt(value -> value.age)
                ).toList();
        System.out.println(filteredAndSorted);

        Random random = new Random();
        IntStream.range(0, 10).map(i -> random.nextInt()).forEach(System.out::println);
    }

}

