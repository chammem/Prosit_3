package tn.esprit.gestionzoo.main;

import java.util.Scanner;
import tn.esprit.gestionzoo.entities.*;
public class ZooManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer le nombre de cages : ");
        int nbrCages =scanner.nextInt();

        scanner.nextLine();

        System.out.println("Veuillez entrer le nom de zoo : ");
        String zooName =scanner.nextLine();

        System.out.println(zooName + " comporte " + nbrCages + " cages");

        Animal lion = new Animal("Simba","Cats",8, true);

        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);

        Zoo myZoo = new Zoo("Belvedere","Tunis");

        Zoo notMyZoo = new Zoo("Park", "bizerte");


        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));


        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));

        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

        System.out.println(myZoo.isZooFull());

        System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
    }
}
