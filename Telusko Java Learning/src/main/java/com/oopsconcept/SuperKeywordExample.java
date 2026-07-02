package com.oopsconcept;


class Bikes{

    public Bikes()
    {
        System.out.println("This is a bike");
    }

    public Bikes(String name)
    {

        System.out.println("This is a bike called " + name);
    }


}

class Trucks extends Bikes {

    public Trucks() {
        //super("KTM");
        System.out.println("This is a truck");
    }

    public Trucks(String name) {

        this();
        System.out.println("This is a truck called " + name);

    }

}


public class SuperKeywordExample {

   public static void main(String[] args)
   {
       Trucks truck1 = new Trucks("Ashok Leyland");
   }

}
