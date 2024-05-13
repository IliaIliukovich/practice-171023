package lesson20240513.dependencyinversion;

public class Lamp {

    public void on(boolean b) {
        System.out.println("Lamp is: " + (b ? "on" : "off"));
    }

}
