package lesson20240212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tasks {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, "");
        List<String> namesWith = findNameStartingWith(names, 'M');
        System.out.println(namesWith);
    }

    // b) Написать метод findNameStartingWith(), который бы возвращал список имен, начинающихся на определенную букву
    public static List<String> findNameStartingWith(List<String> names, char m) {
        List<String> result = new ArrayList<>();
        for (String name : names){
            if (name != null && !name.isEmpty() && name.charAt(0) == m) {
                result.add(name);
            }
        }
        return result;
    }

}
