package lesson20240117.battle;

import java.util.Random;

public class Protection {

    private String name;

    private int level;

    private static Protection[] availableProtection;

    static {
        Protection protection1 = new Protection("Hat", 1);
        Protection protection2 = new Protection("Helmet", 3);
        Protection protection3 = new Protection("Jacket", 1);
        Protection protection4 = new Protection("Armour", 4);
        Protection protection5 = new Protection("T-shirt", 1);
        availableProtection = new Protection[]{protection1, protection2, protection3, protection4, protection5};
    }

    public Protection(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Protection{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

    public static Protection generateRandomProtection() {
        Random random = new Random();
        int r = random.nextInt(availableProtection.length);
        return availableProtection[r];
    }
}
