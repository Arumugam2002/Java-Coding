package com.interfaces;


interface Computer{
    void code();


}

class Laptop implements Computer{

    public void code()
    {
        System.out.println("This is laptop. We code , run and compile");
    }


}

class Desktop implements Computer{

    public void code()
    {
        System.out.println("This is desktop. The code runs faster here than laptop");
    }
}

class Developer extends Laptop{

    public void devCode(Computer lap1)
    {
      lap1.code();
    }

}


public class ComputerExampleInterface {

    public static void main(String[] args)
    {
        Computer laptop1 = new Laptop();
        Computer desktop1 = new Desktop();
        Developer arumugam = new Developer();

        arumugam.devCode(laptop1);

    }

}
