package tn.esprit.gestionzoo.entities;

public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String toString() {
        return "Family: " + family + ", Name: " + name + ", age " + age + ", isMammal " +isMammal;
    }



        public void setage(int age) {
          if (age<0)
            System.out.println("l'age est négative");
          else
              this.age = age;

        }

    }


