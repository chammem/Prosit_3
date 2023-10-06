package tn.esprit.gestionzoo.entities;

public class Zoo {

    static Animal [] animals;
    static String name;
    static String city;
    static final int NBR_CAGES = 25;
    int nbrAnimals;
    public Zoo(String name, String city) {
        animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;

    }

    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + NBR_CAGES;
    }
    //boolean addAnimal(tn.esprit.gestionzoo.entities.Animal animal) {
       // if (searchAnimal(animal) != -1)
          //  return false;
     //   if (nbrAnimals == NBR_CAGES)
         //   return false;
      //  animals[nbrAnimals] = animal;
     //   nbrAnimals++;
       //return true;
  //  }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }


    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
        }
        this.nbrAnimals--;

        return true;
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

  public  int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }
   public  boolean isZooFull() {
        return nbrAnimals == NBR_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        else if (z2.nbrAnimals > z1.nbrAnimals)
            return z2;
        else {
            System.out.println("les deux zoo sont egeaux");
            return z1;
        }

    }
     public void setName(String name) {
        if (name.isBlank())
            System.out.println("le nom est vide");
        else
            this.name = name;

    }

}
