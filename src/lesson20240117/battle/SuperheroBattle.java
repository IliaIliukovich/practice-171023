package lesson20240117.battle;

public class SuperheroBattle {

    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 5);
        Protection helmet = new Protection("Helmet", 2);
        Superhero spiderman = new Superhero("Spiderman", helmet, sword, 2);

        Weapon gun = new Weapon("Gun", 10);
        Protection jacket = new Protection("Jacket", 1);
        Superhero batman = new Superhero("Batman", jacket, gun, 3);

        System.out.println(spiderman);
        System.out.println(batman);
    }


}
