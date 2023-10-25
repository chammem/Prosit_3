package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

        Aquatic aquatic = new Aquatic();
        Dolphin D = new Dolphin();
        Dolphin dolphin = new Dolphin("dauphin","",3,true,"mer",12);

        dolphin.swim();
        //Penguin P = new Penguin();
        Aquatic aquatic1 = new Aquatic("aqua","acuatic1",3,true,"");
        Penguin penguin = new Penguin("mer","",13,true,"",1);

        aquatic.swim();

        penguin.swim();
////////////////////////////////////////////////////

        Animal aquatic5 = new Aquatic("aqua5","aquatic5",27,true,"");


        myZoo.addAquaticAnimal(aquatic5);
        myZoo.displayAquaticAnimals();


        ((Aquatic)aquatic5).swim();





    }
}