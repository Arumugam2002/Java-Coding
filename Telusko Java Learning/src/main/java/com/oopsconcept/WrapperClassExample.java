package com.oopsconcept;

public class WrapperClassExample {

    public static void main(String[] args)
    {
        int num = 20;

        Integer num1 = num; //Autoboxing - from int to Integer(Primitive data type to Wrapper Class)

        int num2 = num1; // Auto-unboxing - from Integer to int(Wrapper class to primitive data type)



        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);

        String str = "30";

        int num3 = Integer.parseInt(str);

        System.out.println(num3*2);
    }

}
