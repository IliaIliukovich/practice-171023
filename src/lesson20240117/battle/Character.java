package lesson20240117.battle;

public abstract class Character {

    private String name;

    private String message;

    public Character(String name) {
        this.name = name;
        this.message = "Hi! I'm " + name;
    }

    public Character(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void introduce(){
        System.out.println(message);
    }
}
