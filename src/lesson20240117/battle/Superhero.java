package lesson20240117.battle;

import java.util.Random;

public class Superhero {

    private String name;

    private String message;

    private int health;

    private int force;

    private Protection protection;

    private Weapon weapon;

    public Superhero(String name, Protection protection, Weapon weapon, int force) {
        this.name = name;
        this.protection = protection;
        this.weapon = weapon;
        this.health = 100;
        this.force = force;
        this.message = "Hi, I'm " + name;
    }

    public Superhero(String name, Protection protection, Weapon weapon, int force, String message) {
        this.name = name;
        this.protection = protection;
        this.weapon = weapon;
        this.health = 100;
        this.force = force;
        this.message = message;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        if (force < 0) throw new RuntimeException("Force cannot be less than 0");
        this.force = force;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Protection getProtection() {
        return protection;
    }

    public void setProtection(Protection protection) {
        this.protection = protection;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Hero='" + name + '\'' +
                ", health=" + health +
                ", force=" + force +
                ", protection=" + protection +
                ", weapon=" + weapon;
    }

    public static Superhero generateRandomSuperHero() {
        Random random = new Random();
        Weapon weapon = Weapon.generateRandomWeapon();
        Protection protection = Protection.generateRandomProtection();
        String[] names = {"Batman", "Superman", "Spiderman"};
        return new Superhero(names[random.nextInt(names.length)], protection, weapon, random.nextInt(5));
    }

    public void fight(Superhero another) {
        System.out.println(this.name + " fights with " + another.name);
        int myForce = this.force + this.weapon.getForce();
        int anotherForce = another.force + another.weapon.getForce();
        if (myForce < anotherForce) {
            System.out.println(another.name + " wins");
            this.health = this.health - (anotherForce - myForce) / this.protection.getLevel();
        } else if (myForce > anotherForce) {
            System.out.println(this.name + " wins");
            another.health = another.health - (myForce - anotherForce) / another.protection.getLevel();
        } else {
            System.out.println("No one wins. Powers are equal");
        }
    }

    public void introduce(){
        System.out.println(message);
    }
}
