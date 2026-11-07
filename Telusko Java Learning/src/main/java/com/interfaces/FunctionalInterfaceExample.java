package com.interfaces;


@FunctionalInterface
interface Animal{

    void sound(int i, int j);


}

//class Dog implements Animal{
//    @Override
//    public void sound()
//    {
//        System.out.println("Dog is barking");
//    }
//
//}


public class FunctionalInterfaceExample {

  public static void main(String[] args)
   {
//        Animal animal1 = new Animal() {
//            @Override
//            public void sound(int i) {
//                System.out.println("Animal is making sounds" + i);
//            }
//        };

        Animal animal1 = (i, j) -> //Variable type mention is not necessary in lambda as it is defined in method
        {
              System.out.println("Animal is making sounds " + i + " " + j);
          }
        ;

        animal1.sound(5,10);
    }

}
