package com.oopsconcept;



    class Animal3{

        private int animalCount;

        private String animalName;

        public Animal3()
        {
            animalCount = 120;
            animalName = "Cat";
        }

        public Animal3(int animalCount, String animalName)
        {
            this.animalCount = animalCount;
            this.animalName = animalName;
        }

        public Animal3(int animalCount)
        {
           this.animalName = "Cow";
            this.animalCount = animalCount;
        }

        //public void setAnimalCount(int animalCount, Animal1 animal1)

        public void setAnimalCount(int animalCount)


        {
//        Animal1 animal2 = animal1;
//        animal2.animalCount = animalCount;

            this.animalCount = animalCount;
        }

        //public void setAnimalName(String animalName, Animal1 animal1)

        public void setAnimalName(String animalName)
        {
//        Animal1 animal2 = animal1;
//
//        animal2.animalName = animalName;

            this.animalName = animalName;
        }

        public int getAnimalCount()
        {
            return animalCount;
        }

        public String getAnimalName()
        {
            return animalName;
        }

    }

    public class ConstructorLearning{

        public static void main(String[] args)
        {
            Animal3 animal3 = new Animal3();
            Animal3 animal4 = new Animal3(200, "Donkey");
            Animal3 animal5 = new Animal3(500);

//        animal1.setAnimalCount(60, animal1);
//        animal1.setAnimalName("Lion", animal1);



            System.out.println(animal3.getAnimalCount() + " " + animal3.getAnimalName());

            System.out.println(animal4.getAnimalCount() + " " + animal4.getAnimalName());

            System.out.println(animal5.getAnimalCount() + " " + animal5.getAnimalName());



        }
    }


