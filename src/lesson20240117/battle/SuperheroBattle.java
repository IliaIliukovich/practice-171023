package lesson20240117.battle;

public class SuperheroBattle {

    // Superhero battle
    //
    //Superhero class:
    //- name String
    //- health int
    //- force int
    //- Weapon class: - name String
    //			    - force int
    //- Protection class: - name String
    //				    - level int
    //
    //методы:
    //- static generateRandomSuperHero()
    //- fight()  ----> health =  health - (force1 - force2) / level
    //
    //
    //1. Создать 3 класса Superhero, Weapon, Protection
    //2. Создать несколько персонажей SuperheroBattle main()
    //3. Реализовать методы generateRandomSuperHero(), fight()
    //fight(Superhero another)
    //fight(Superhero one, Superhero second)
    //4. Продемонстировать сражение между случайными персонажами

    //5. Создать класс Wizard - волшебник. Реализовать у волшебника
    //- методы heal(Superhero hero), heal(Superhero[] heroes) исцеления раненых персонажей
    //- методы increaseForce(Superhero hero), increaseForce(Superhero[] heroes) увеличения силы персонажей.
    //Сила увеличивается пропорционально уровню (поле level) волшебника по формуле force = force + force * 0.1 * level
    //6. В классы Superhero и Wizard добавить метод introduce(), который выводил бы в консоль тест приветствия персонажа.
    //По умолчанию приветствие выводится в виде "Hi, I'm Batman!".
    //Однако должна быть возможность каждому персонажу задавать свой особенный текст.

    // Пример запуска методов:
    //    Wizard wizard1 = new Wizard("Wizard 1 Name", 10, "I'm wizard. I can do magic");
    //    wizard.introduce();
    //
    //    Wizard wizard2 = new Wizard("Wizard 2 Name", 5);
    //    wizard2.introduce();
    //
    //    wizard1.heal(jack);

    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 15);
        Protection helmet = new Protection("Helmet", 2);
        Superhero jack = new Superhero("Jack", helmet, sword, 2, "Jack is main character in this battle...");

        Weapon gun = new Weapon("Gun", 50);
        Protection jacket = new Protection("Jacket", 1);
        Superhero william = new Superhero("William", jacket, gun, 3);

        System.out.println("Before fight:");
        System.out.println(jack);
        System.out.println(william);
        jack.fight(william);
        System.out.println("After fight:");
        System.out.println(jack);
        System.out.println(william);

        System.out.println("-----Fight with randomSuperHero-----");
        Superhero randomSuperHero = Superhero.generateRandomSuperHero();
        randomSuperHero.introduce();
        william.fight(randomSuperHero);

        Wizard wizard = new Wizard("Dumbledore", 5);
        wizard.introduce();
        wizard.heal(jack);
        wizard.increaseForce(jack);
        System.out.println(jack);

        Wizard evilWizard = new Wizard("Evil wizard", 10, "Evil wizard has knowledge of dark magic");
        evilWizard.introduce();
    }


}
