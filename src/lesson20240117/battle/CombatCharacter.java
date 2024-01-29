package lesson20240117.battle;

public abstract class CombatCharacter extends Character {

    private int health;

    public CombatCharacter(String name) {
        super(name);
        this.health = 100;
    }

    public CombatCharacter(String name, String message) {
        super(name, message);
        this.health = 100;
    }

    public abstract int countForce();

    public abstract int countProtectionLevel();

    public void fight(CombatCharacter another){
        System.out.println(this.getName() + " fights with " + another.getName());
        int myForce = countForce();
        int anotherForce = another.countForce();
        if (myForce < anotherForce) {
            System.out.println(another.getName() + " wins");
            this.health = this.health - (anotherForce - myForce) / countProtectionLevel();
        } else if (myForce > anotherForce) {
            System.out.println(this.getName() + " wins");
            another.health = another.health - (myForce - anotherForce) / another.countProtectionLevel();
        } else {
            System.out.println("No one wins. Powers are equal");
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
