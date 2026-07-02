package com.inheritance;



public class InheritanceLearning
{

    public static void main(String[] args)
    {
        VeryAdvancedCalculator calc1 = new VeryAdvancedCalculator();

        System.out.println(calc1.add(10,25));
        System.out.println(calc1.subtract(24,20));

        System.out.println(calc1.multiplication(20,20));

        System.out.println(calc1.division(40,8));

        System.out.println(calc1.modulo(300,23));

        System.out.println(calc1.power(2,8));


    }

}
