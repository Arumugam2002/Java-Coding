package com.oopsconcept;

class Example{

    public Example()
    {
        System.out.println("Object has been created");
    }

    public void show()
    {
        System.out.println("Show method has been called");
    }


}


public class AnonymousObject {

    public static void main(String[] args)
    {
        new Example().show();
        new Example().show();
        new Example().show();


    }



}
