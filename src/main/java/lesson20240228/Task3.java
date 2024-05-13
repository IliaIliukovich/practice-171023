package lesson20240228;

public class Task3 {


    public static void main(String[] args) {
        int x = 2;
        int n = 7;

        System.out.println(power(x, n));
    }


    // n - четное
    //x^n = x^(n/2) * x^(n/2)
    //
    //n - нечетное
    //x^n = x^(n-1)*x

    public static int power(int x, int n) {
        if (n == 1) return x; // base condition

        if (n % 2 == 0) {
            int a = power(x, n/2);
            return a * a;
        } else {
            return power(x, n - 1) * x;
        }
    }

}
