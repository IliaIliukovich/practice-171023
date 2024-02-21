package lesson20240221;

import java.util.HashSet;
import java.util.Set;

public class Rectangle {

    private double x;

    private double y;

    public Rectangle() {
    }

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Set<Rectangle> set = new HashSet<>();
        Rectangle rectangle1 = new Rectangle(10.0, 20.0);
        Rectangle rectangle2 = new Rectangle(10.0, 20.0);
        Rectangle rectangle3 = new Rectangle();
        Rectangle rectangle4 = new Rectangle();

        set.add(rectangle1);
        set.add(rectangle2);
        set.add(rectangle3);
        set.add(rectangle4);
        System.out.println(set.size());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(x, rectangle.x) == 0 && Double.compare(y, rectangle.y) == 0;
//        return this.x.equals(rectangle.x) && this.y.equals(rectangle.y);
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Rectangle rectangle = (Rectangle) o;
//        return Objects.equals(x, rectangle.x) && Objects.equals(y, rectangle.y);
//    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(x);
        result = result * 31 + Double.hashCode(y);
        return result;
//        return Objects.hash(x, y);
    }
}
