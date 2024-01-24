package lesson20240117.battle;

public class Wizard extends Character {

    private int level;

    public Wizard(String name, int level) {
        super(name);
        this.level = level;
    }

    public Wizard(String name, int level, String message) {
        super(name, message);
        this.level = level;
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
        System.out.println("Wizard " + getName() + " increased force of " + superhero.getName());
    }

    public void increaseForce(Superhero[] superheroes){
        for (Superhero superhero : superheroes) {
            increaseForce(superhero);
        }
    }


}
