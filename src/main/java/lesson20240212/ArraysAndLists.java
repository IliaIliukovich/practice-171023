package lesson20240212;

import java.util.ArrayList;
import java.util.List;

public class ArraysAndLists {

    public static void main(String[] args) {
        //        List<String> list = new ArrayList<>(10);
        List<String> list = new ArrayList<>();
        String[] strings = new String[10];
        String string = strings[5];
        String string1 = list.get(5);

        int[] ints;
//        List<int> list1;
        List<Integer> list2;

        List<String> stringList = List.of("A", "B", "C");
        new ArrayList<>(List.of("A", "B"));
    }

}
