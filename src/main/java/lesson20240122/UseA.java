package lesson20240122;

public class UseA {


    public static void main(String[] args) {

        A.staticMethod();
        A a = new A(2000);
        a.method();

        // 1 static field init
        // 2 static blocks
        // 3 non-static field init
        // 4 non-static blocks
        // 5 constructor

    }


}
