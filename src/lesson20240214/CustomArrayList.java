package lesson20240214;

import java.util.Iterator;

public class CustomArrayList implements Iterable<String> {

    private String[] data;

    public CustomArrayList(String[] data) {
        this.data = data;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList(new String[] {"A", "B", "C", "D"});

        for (String s : list) {
            System.out.println(s);
        }
    }

    @Override
    public Iterator<String> iterator() { // TODO
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };
    }
}
