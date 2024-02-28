package lesson20240226;

import java.util.Comparator;

public class ItemMaxPriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
