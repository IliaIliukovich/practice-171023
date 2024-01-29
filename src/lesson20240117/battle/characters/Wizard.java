package lesson20240117.battle.characters;

import lesson20240117.battle.characters.Character;
import lesson20240117.battle.characters.CombatCharacter;
import lesson20240117.battle.characters.Superhero;
import lesson20240117.battle.skills.HealingSkills;
import lesson20240117.battle.skills.ReinforcementSkills;

public class Wizard extends Character implements HealingSkills, ReinforcementSkills {

    private int level;

    public Wizard(String name, int level) {
        super(name);
        this.level = level;
    }

    public Wizard(String name, int level, String message) {
        super(name, message);
        this.level = level;
    }

    @Override
    public void heal(CombatCharacter hero){
        if (hero.getHealth() == 100) {
            System.out.println(hero.getName() + " is healthy. Nothing to heal");
        } else {
            hero.setHealth(100);
            System.out.println(hero.getName() + " has been healed");
        }
    }

    @Override
    public void heal(CombatCharacter[] characters){
        for (CombatCharacter character : characters){
            heal(character);
        }
    }

    @Override
    public void increaseForce(Superhero superhero) {
        int force = superhero.getForce();
        force = force + (int) (force * 0.1 * level);
        superhero.setForce(force);
        System.out.println("Wizard " + getName() + " increased force of " + superhero.getName());
    }

    @Override
    public void increaseForce(Superhero[] superheroes){
        for (Superhero superhero : superheroes) {
            increaseForce(superhero);
        }
    }


}
