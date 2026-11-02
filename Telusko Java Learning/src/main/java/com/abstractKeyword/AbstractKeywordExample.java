package com.abstractKeyword;


abstract class Bike{

    public abstract void ride();

    public abstract void stop();


    public void headlightsOn()
    {
            System.out.println("Headlights are on");
    }

}

abstract class Honda extends Bike{

    public void ride()
    {
        System.out.println("Honda bike is riding");
    }

}

class Sp125 extends Honda{

    public void stop()
    {
        System.out.println("Sp125 Bike has been stopped");
    }

}




public class AbstractKeywordExample {

    public static void main(String[] args)
    {
        Bike bike1 = new Sp125();

        bike1.ride();
        bike1.headlightsOn();

        Honda hondaBike1 = new Sp125();
        hondaBike1.ride();
        hondaBike1.headlightsOn();
        hondaBike1.stop();
    }





}
