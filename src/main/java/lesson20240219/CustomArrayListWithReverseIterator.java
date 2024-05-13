package lesson20240219;

import java.util.Iterator;

public class CustomArrayListWithReverseIterator implements Iterable<String> {

    private String[] data;

    public CustomArrayListWithReverseIterator(String[] data) {
        this.data = data;
    }

    public static void main(String[] args) {
        CustomArrayListWithReverseIterator list = new CustomArrayListWithReverseIterator(new String[] {"A", "B", "C", "D"});

//        for (String s : list) {
//            System.out.println(s);
//        }

        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.next());

        // D C B A

    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {

            int count = data.length - 1;
            @Override
            public boolean hasNext() {
                return count >= 0;
            }

            @Override
            public String next() {
                if (!hasNext()) throw new RuntimeException("No elements present");
                return data[count--];
            }
        };
    }
}
