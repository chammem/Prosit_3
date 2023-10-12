package tn.esprit.gestionzoo.entities;

    public non-sealed class Aquatic extends Animal {
        private String habitat ;

        public Aquatic(String habitat) {

            this.habitat = habitat;
        }
        public Aquatic() {


        }

        @Override
        public String toString() {
            return super.toString()+"Aquatic{" +
                    "habitat='" + habitat + '\'' +
                    '}';
        }

        public void swim(){
            System.out.println("This aquatic animal is swimming.");
        }
    }

