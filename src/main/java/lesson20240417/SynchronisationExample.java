package lesson20240417;

import lesson20240304.Cat;

public class SynchronisationExample {

    static Cat mutex = new Cat("Tom", "White", 2, 2.0);

    public static void main(String[] args) {


        synchronized (mutex) { //   synch with staticMethod()
            System.out.println("Action in main");
        }

        SynchronisationExample example = new SynchronisationExample();
        synchronized (example) { // synch with nonStatciSynchMethod(), nonStatciSynchMethod2()
            System.out.println("Action in main");
        }

        synchronized (SynchronisationExample.class) { // synch with staticSynchMethod(), staticSynchMethod2()
            System.out.println("Action in main");
        }

    }

    public static void  staticMethod() {
        synchronized (mutex) {
            System.out.println("Action in static method");
        }
    }

    public synchronized void nonStatciSynchMethod() {
        System.out.println("Action in non-static method");
    }

    public void nonStatciSynchMethod2() {
        synchronized (this) {
            System.out.println("Action in non-static method");
        }
    }

    public synchronized static void  staticSynchMethod() {
        System.out.println("Action in static method");
    }

    public static void  staticSynchMethod2() {
        synchronized (SynchronisationExample.class) {
            System.out.println("Action in static method");
        }
    }


}
