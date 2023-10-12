package tn.esprit.gestionzoo.entities;


public  sealed  class Animal permits Aquatic, Terrestrial {
    public String family;
    public String name;
    private int age;
    private boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getName() {
        return name;
    }

    public Animal() {

    }

    public String toString() {
        return "Family: " + family + ", Name: " + name + ", age " + age + ", isMammal " +isMammal;
    }



    public void setAge(int age) {
          if (age<0)
            System.out.println("l'age est négative");
          else
              this.age = age;

        }

    public void setMammal(boolean isMammal) {

            this.isMammal = isMammal;

    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }





    }




