package com.oopsconcept;


class A{

    public int multiplicate(int n1, int n2)
    {
        return  n1*n2;
    }
}

class B extends A{

    public int multiplicate(int n1, int n2)
    {
        return n1*n2*10;
    }
}


public class MethodOverridingExample {

    public static void main(String[] args)
    {
        A obj1 = new B();

        System.out.println(obj1.multiplicate(20,40));
    }

}
