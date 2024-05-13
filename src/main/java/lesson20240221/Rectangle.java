package lesson20240221;

import java.util.*;

public class Rectangle {

    private double x;

    private double y;

    public Rectangle() {
    }

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
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

        Rectangle rectangle5 = new Rectangle(30.0, 20.0);
        Rectangle rectangle6 = new Rectangle(20.0, 20.0);
        List<Rectangle> rectangles = Arrays.asList(rectangle1, rectangle2, rectangle3,
                rectangle4, rectangle5, rectangle6);
        rectangles.sort(new CompareByX());
        System.out.println(rectangles);
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

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
