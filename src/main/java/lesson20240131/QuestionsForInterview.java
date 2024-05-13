package lesson20240131;

import lesson20240117.battle.characters.Character;
import lesson20240117.battle.characters.Mag;

public class QuestionsForInterview {

    static final String DATABASE_URL = "jdbc:mysql://localhost:3306";
    static final double PI = 3.141516;

    public static void main(String[] args) {
        A.doSomethingStatic(); // раннее связывание

//        A a = new A(); // раннее связывание
//        a.doSomething();

        A a;
        // some code
        boolean condition = false;
        if (condition) {
            a = new A();
        } else {
            a = new B("data");

        }
        a.doSomething(); // позднее связывание


        Character character = new Mag("Mag", 1, 1, 1);
        character.introduce();

    }


    static class A {

        public A() {
            this("Default value");
        }

        public A(String field) {
            this.field = field;
        }

        private String field;

        public void doSomething(){
            System.out.println("doSomething A");
//            new A();
//            this();
        }

        public void doSomething(String s){

            System.out.println(s);
            System.out.println(this.field);
            System.out.println("doSomething A");
        }

        public void doSomething(String... s){
            System.out.println("doSomething A");
        }

//        public void doSomething(String[] s){
//            System.out.println("doSomething A");
//        }

        public static void doSomethingStatic(){
        }

    }

    static class B extends A {

        public B(String field) {
            super();
            System.out.println("Some other logic in constructor");
        }

        @Override
        public void doSomething() {
            System.out.println("doSomething B");
        }
    }


}
