package lesson20240122;

public class A {

    private static int staticField = 100;

    static {
        System.out.println("Static init block");
        staticField = 200;
    }

    private int field = 1000;
    {
        System.out.println("Non-static init block");
    }

    public A(int field) {
        System.out.println("Constructor called");
        this.field = field;
    }

    public static void staticMethod() {
        System.out.println("Static method called");
        System.out.println(staticField);
    }

    public void method() {
        System.out.println("Non-static method called");
        System.out.println(field);
    }



}
