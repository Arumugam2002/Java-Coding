package com.oopsconcept;

class Animal{

    private int animalCount;

    private String animalName;

    public void setAnimalCount(int animalCount)
    {
        this.animalCount = animalCount;
    }

    public void setAnimalName(String animalName)
    {
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

public class EncapsulationLearning {

    public static void main(String[] args)
    {
        Animal animal1 = new Animal();

        animal1.setAnimalCount(60);
        animal1.setAnimalName("Lion");

        System.out.println(animal1.getAnimalCount());
        System.out.println(animal1.getAnimalName());


    }
}
