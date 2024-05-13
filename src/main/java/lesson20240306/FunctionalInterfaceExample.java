package lesson20240306;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
//        Stream stream;

        DoSomething doSomething = new DoSomething() {
            @Override
            public void doSomething() {
                System.out.println("do Something");
            }

//            @Override
//            public void doSomething2() {
//                System.out.println("do Something 2");
//
//            }
        };
        doSomething.doSomething();

        doSomething = () -> System.out.println("do something in lambda");
        doSomething.doSomething();

        // (void) ---> Data Supplier
        // (data) ----> (void) Consumer
        // (data) ----> (data) Function, UnaryOperator, Predicate
        // (data1, data2) ----> (data3) BiFunction, BinaryOperator
    }


}
