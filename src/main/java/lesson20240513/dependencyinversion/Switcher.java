package lesson20240513.dependencyinversion;

public class Switcher {

    private Lamp lamp = new Lamp();

    public void switchOn(){
        lamp.on(true);
    }

    public void switchOff(){
        lamp.on(false);
    }


    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        switcher.switchOn();
        switcher.switchOff();
    }

}
