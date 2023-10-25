package tn.esprit.gestionzoo.entities;

public class Zoo {

    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    private int nbrAquaticAnimals;
    private Animal[] aquaticAnimals;


    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        aquaticAnimals = new Animal[10];
        this.name = name;
        this.city = city;
    }

    public boolean isAquaticAnimalsFull() {
        return nbrAquaticAnimals == 10;
    }
    public int searchAquaticAnimal(Animal aquaticAnimal) {
        int index = -1;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimal.getName().equals(aquaticAnimals[i].getName()))
                return i;
        }
        return index;
    }
    public void displayAquaticAnimals() {
        System.out.println("List of aquatic animals of " + name + ":");
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            System.out.println(aquaticAnimals[i]);
        }
    }
    public int getNbrAquaticAnimals() {
        return nbrAquaticAnimals;
    }

    public void setNbrAquaticAnimals(int nbrAquaticAnimals) {
        this.nbrAquaticAnimals = nbrAquaticAnimals;
    }

    public Animal[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Animal[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }



    public void addAquaticAnimal(Animal aquaticAnimal) {
        if (searchAquaticAnimal(aquaticAnimal) != -1)
            return;
        if (isAquaticAnimalsFull())
            return;
        aquaticAnimals[nbrAquaticAnimals] = aquaticAnimal;
        nbrAquaticAnimals++;
    }

        public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

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
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }
}

