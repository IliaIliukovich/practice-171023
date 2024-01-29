package lesson20240117.battle;

public class EvilCreature extends CombatCharacter {

    private int force;

    private int protectionLevel;

    private boolean isAngry;

    public EvilCreature(String name, int force, int protectionLevel) {
        super(name);
        this.force = force;
        this.protectionLevel = protectionLevel;
    }

    public EvilCreature(String name, String message, int force, int protectionLevel) {
        super(name, message);
        this.force = force;
        this.protectionLevel = protectionLevel;
    }

    @Override
    public int countForce() {
        return isAngry ? (2 * force) : force;
    }

    @Override
    public int countProtectionLevel() {
        return protectionLevel;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }
}
