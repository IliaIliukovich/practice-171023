package lesson20240228;

public class Task2 {

    // Напишите рекурсивный метод для нахождения суммы цифр заданного целого числа.

    public static void main(String[] args) {
        int number = 102306;
        System.out.println(sumNumbers(number));
        System.out.println(sumNumbersWithLoop(number));
    }

    public static int sumNumbersWithLoop(int number) { // O(n)
        int numberToCalculate = number;
        int sum = 0;
        while (numberToCalculate > 0) {
            int currentNumber = numberToCalculate % 10;
            numberToCalculate = numberToCalculate / 10;
            sum += currentNumber;
        }
        return sum;
    }

    public static int sumNumbers(int number) { // O(n)
        if (number < 10) return number; // base condition

        int  currentNumber= number % 10;
        int numberToCalculate = number / 10;
        return currentNumber + sumNumbers(numberToCalculate);
    }




}
