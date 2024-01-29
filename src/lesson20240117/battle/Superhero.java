package lesson20240117.battle;

import java.util.Random;

public class Superhero extends CombatCharacter {

    private int force;

    private Protection protection;

    private Weapon weapon;

    public Superhero(String name, Protection protection, Weapon weapon, int force) {
        super(name);
        this.protection = protection;
        this.weapon = weapon;
        this.force = force;
    }

    public Superhero(String name, Protection protection, Weapon weapon, int force, String message) {
        super(name, message);
        this.protection = protection;
        this.weapon = weapon;
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        if (force < 0) throw new RuntimeException("Force cannot be less than 0");
        this.force = force;
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
        return "Hero='" + getName() + '\'' +
                ", health=" + getHealth() +
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

    @Override
    public int countForce() {
        return force + weapon.getForce();
    }

    @Override
    public int countProtectionLevel() {
        return protection.getLevel();
    }
}
