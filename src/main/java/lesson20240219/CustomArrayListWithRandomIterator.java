package lesson20240219;

import lesson20240221.Shuffle;

import java.util.Arrays;
import java.util.Iterator;

public class CustomArrayListWithRandomIterator implements Iterable<String> {

    private String[] data;

    public CustomArrayListWithRandomIterator(String[] data) {
        this.data = data;
    }

    public static void main(String[] args) {
        CustomArrayListWithRandomIterator list = new CustomArrayListWithRandomIterator(new String[] {"A", "B", "C", "D"});

        for (String s : list) {
            System.out.println(s);
        }

        for (String s : list) {
            System.out.println(s);
        }

    }

    @Override
    public Iterator<String> iterator() {

        return new Iterator<>() {
            String[] randomData;

            {
                randomData = Arrays.copyOf(data, data.length);
                Shuffle.shuffle(randomData);
            }


            int count = 0;
            @Override
            public boolean hasNext() {
                return count < randomData.length;
            }

            @Override
            public String next() {
                if (!hasNext()) throw new RuntimeException("No elements present");
                return randomData[count++];
            }
        };
    }
}
