package com.upcastinganddowncasting;


class A{

    public void show1()
    {
        System.out.println("This is A class");
    }

}

class B extends A{

    public void show2()
    {
        System.out.println("This is B class");
    }

}


public class UpCastingAndDownCastingExample {




    public static void main(String[] args)
    {

        //Variable typecasting

//        double number1 = 105.23;
//
//        System.out.println(number1);
//
//        int number2 = (int) number1;
//
//        System.out.println(number2);


        A obj1 = new B();
        obj1.show1();

        B obj2 = (B) obj1;

        obj2.show2();



    }

}
