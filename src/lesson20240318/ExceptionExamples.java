package lesson20240318;

public class ExceptionExamples {

    public static void main(String[] args) {
        try {
            method();
        } catch (NullPointerException | ArithmeticException  exception) {
            System.out.println(exception.getMessage());
//            exception.printStackTrace();
        } finally {
            System.out.println("finally block");
        }
        System.out.println("Some code later");
    }

    public static void method() {
        System.out.println(1 / 0);
//        throw new NullPointerException("my message");
    }


}
