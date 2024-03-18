package lesson20240318;

import java.io.IOException;

public class Task3 {

    public static void method1() {
        System.out.println(1 / 0);
    }
    public static void method2() {
        throw new NullPointerException("nulls everywhere!");
    }
    public static void method3() throws IOException {
        throw new IOException("File not found");
    }

    public static void commonMethod() throws MyAppException{
        try {
//            method1();
            method2();
            method3();
        } catch (Exception e) {
            throw new MyAppException(e.getMessage(), e);
        }
    }

    public static void main(String[] args) {
        try {
            commonMethod();
        } catch (MyAppException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

}
