package lesson20240117.battle;

public class Superhero {

    private String name;

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
}
