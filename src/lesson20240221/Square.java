package lesson20240221;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Square extends Rectangle{

    public Square(double x) {
        super(x, x);
    }


    public static void main(String[] args) {
        Square square1 = new Square(5.0);
        Square square2 = new Square(1.0);
        Square square3 = new Square(3.0);
        Square square4 = new Square(4.0);
        Square square5 = new Square(2.0);

        Set<Square> set = new HashSet<>();
        set.add(square1);
        set.add(square2);
        set.add(square3);
        set.add(square4);
        set.add(square5);
        System.out.println(set.size());
        System.out.println(set);

        set = new TreeSet<>(new CompareByX());
        set.add(square1);
        set.add(square2);
        set.add(square3);
        set.add(square4);
        set.add(square5);
        System.out.println(set.size());
        System.out.println(set);

        // HashSet  ----- equals(), hashcode()
        // o1.equals(o2) ----> o1.hashCode() == o2.hashCode()

        // TreeSet ----- equals() must be consistent with compareTo()
        // o1.equals(o2) <-----> o1.compareTo(o2) == 0
    }
}
