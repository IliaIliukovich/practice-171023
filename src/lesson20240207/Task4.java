package lesson20240207;

import java.util.Arrays;

public class Task4 {

    //4. Создать метод transpose(), который будет транспонировать матрицу (заменять строки на столбцы).
    //Input:
    //	1 2 3 4
    //	5 6 7 8
    //	9 0 0 0
    //Output:
    //	1 5 9
    //	2 6 0
    //	3 7 0
    //	4 8 0
    //

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 0, 0, 0}};

        int[][] output = transpose(input);
        for (int[] ints : output) {
            System.out.println(Arrays.toString(ints));
        }
//        System.out.println(Arrays.deepToString(output));

        NewClass newClass = new NewClass();
    }

    public static int[][] transpose(int[][] input) {
        int[][] output = new int[(input[0]).length][input.length];

        for (int i = 0; i < input.length; ++i) {
            for(int j = 0; j < input[0].length; ++j) {
                output[j][i] = input[i][j];
            }
        }
        return output;
    }


}
