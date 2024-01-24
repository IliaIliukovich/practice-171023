package lesson20240117.battle;

public class Wizard {

    private String name;

    private int level;

    private String message;

    public Wizard(String name, int level) {
        this.name = name;
        this.level = level;
        this.message = "Hi, I' am " + name;
    }

    public Wizard(String name, int level, String message) {
        this.name = name;
        this.level = level;
        this.message = message;
    }

    public void heal(Superhero hero){
        if (hero.getHealth() == 100) {
            System.out.println(hero.getName() + " is healthy. Nothing to heal");
        } else {
            hero.setHealth(100);
            System.out.println(hero.getName() + " has been healed");
        }
    }

    public void heal(Superhero[] heroes){
        for (Superhero superhero : heroes){
            heal(superhero);
        }
    }

    public void increaseForce(Superhero superhero) {
        int force = superhero.getForce();
        force = force + (int) (force * 0.1 * level);
        superhero.setForce(force);
    }

    public void increaseForce(Superhero[] superheroes){
        for (Superhero superhero : superheroes) {
            increaseForce(superhero);
        }
    }

    public void introduce(){
        System.out.println(message);
    }



}
