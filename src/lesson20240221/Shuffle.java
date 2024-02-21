package lesson20240221;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {

    public static void main(String[] args) {
        String[] data = {"A", "B", "C", "D", "E"};
        shuffle(data);
        System.out.println(Arrays.toString(data));

//        Collections.shuffle();
    }

    public static void shuffle(String[] strings) {
        Random random = new Random();
        for (int i = 1; i < strings.length; i++) {
            swap(strings, i, random.nextInt(i + 1));
//            swap(strings, i, random.nextInt(strings.length));
        }


    }

    public static void swap(String[] strings, int i, int j) {
        String tmp = strings[i];
        strings[i] = strings[j];
        strings[j] = tmp;
    }

}
