package lesson20240117.battle;

public class SuperheroBattle {

    // Main logic of the battle game
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
