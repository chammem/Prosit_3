package tn.esprit.gestionzoo.entities;


    public final class Terrestrial extends Animal {
        private int nbrLegs;

        public Terrestrial(int nbrLegs) {

            this.nbrLegs = nbrLegs;
        }

        @Override
        public String toString() {
            return super.toString() +
                    "nbrLegs=" + nbrLegs ;
        }

        public Terrestrial() {


        }
    }
