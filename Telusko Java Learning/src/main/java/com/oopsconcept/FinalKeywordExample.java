package com.oopsconcept;

 //final class Addition - Final Class
 class Addition{

    //public final void display() // Final method
     public  void display()
    {
        System.out.println("This is addition method");
    }

    public  int add(int a, int b)
    {
        return a + b;
    }

}

class Subtraction extends Addition{

     public void display()
     {
         System.out.println("This is subtraction method");
     }


}


public class FinalKeywordExample {

     public static void main(String[] args)
     {
         //final int a = 20; //final variable

        int a = 30;

         int b = 40;

         System.out.println(a + " " + b);

         Addition add1 = new Addition();

         add1.display();

         Subtraction sub1 = new Subtraction();

         sub1.display();

     }


}
