package lesson20240226;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Task1 {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(10);
        set.add(2);
        set.add(14);

        findNumbersLessThan7(set);
    }

    private static void findNumbersLessThan7(TreeSet<Integer> integers) {
//        for (Integer i : integers){
//            if (i < 7) {
//                System.out.println(i);
//            } else {
//                break;
//            }
//        }
        SortedSet<Integer> set = integers.headSet(7);
        System.out.println(set);
    }


}
