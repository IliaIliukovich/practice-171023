package lesson20240117.battle.characters;

import lesson20240117.battle.skills.HealingSkills;
import lesson20240117.battle.skills.ReinforcementSkills;
import lesson20240117.battle.skills.Spells;

public class Mag extends CombatCharacter implements HealingSkills, ReinforcementSkills, Spells {

    private int force;

    private int protectionLevel;

    private int spellsLevel;

    public Mag(String name, int force, int protectionLevel, int spellsLevel) {
        super(name);
        this.force = force;
        this.protectionLevel = protectionLevel;
        this.spellsLevel = spellsLevel;
    }

    public Mag(String name, String message, int force, int protectionLevel, int spellsLevel) {
        super(name, message);
        this.force = force;
        this.protectionLevel = protectionLevel;
        this.spellsLevel = spellsLevel;
    }


    @Override
    public int countForce() {
        return force;
    }

    @Override
    public int countProtectionLevel() {
        return protectionLevel;
    }

    @Override
    public void heal(CombatCharacter character) {
        if (character.getHealth() == 100) {
            System.out.println(character.getName() + " is healthy. Nothing to heal");
        } else {
            character.setHealth(100);
            System.out.println(character.getName() + " has been healed");
        }
    }

    @Override
    public void heal(CombatCharacter[] characters) {
        for (CombatCharacter character : characters) {
            heal(character);
        }
    }

    @Override
    public void increaseForce(Superhero superhero) {
        int force = superhero.getForce();
        force = force + (int) (force * 0.1 * spellsLevel);
        superhero.setForce(force);
        System.out.println("Mag " + getName() + " increased force of " + superhero.getName());
    }

    @Override
    public void increaseForce(Superhero[] superheroes){
        for (Superhero superhero : superheroes) {
            increaseForce(superhero);
        }
    }

    @Override
    public void curse(CombatCharacter character) {
        System.out.println("Mag " + getName() + " curses " + character.getName());
        character.setHealth((int) (character.getHealth() * (1 - 0.1 * spellsLevel)));
    }
}
