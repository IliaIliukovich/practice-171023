package lesson20240212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxOrMinTask {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // get max
        // 1 вариант
        int c;
        if (a > b){
            c = a;
        } else {
            c = b;
        }

        // 2 вариант
        c = (a > b) ? a : b;
        // 3 вариант
        c = Math.max(a, b);


//        Arrays.sort(); O(n * log n)
//        max O(n)
//        Collections.max()
    }


}
