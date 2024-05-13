package lesson20240221;

import java.util.Comparator;

public class CompareByX implements Comparator<Rectangle> {
//    @Override
//    public int compare(Rectangle o1, Rectangle o2) {
//        double result = o1.getX() - o2.getX();
//        if (result == 0) return 0;
//        return result < 0 ? -1 : 1;
//    }

    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        return Double.compare(o1.getX(), o2.getX());
    }

//    @Override
//    public int compare(Rectangle o1, Rectangle o2) {
//        return ((Double) o1.getX()).compareTo(o2.getX());
//    }
}
