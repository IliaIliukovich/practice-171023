package lesson20240117.battle.skills;

import lesson20240117.battle.characters.CombatCharacter;

public interface HealingSkills {

    void heal(CombatCharacter character);

    void heal(CombatCharacter[] characters);
}
