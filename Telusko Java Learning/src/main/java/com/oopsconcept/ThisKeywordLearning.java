package com.oopsconcept;

class Animal1{

    private int animalCount;

    private String animalName;

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

public class ThisKeywordLearning {

    public static void main(String[] args)
    {
        Animal1 animal1 = new Animal1();

//        animal1.setAnimalCount(60, animal1);
//        animal1.setAnimalName("Lion", animal1);

        animal1.setAnimalCount(100 );
        animal1.setAnimalName("Tiger");

        System.out.println(animal1.getAnimalCount());
        System.out.println(animal1.getAnimalName());


    }
}
