package com.inheritance;

import com.accessmodifier.AccessModifierExample;

public class AdvancedCalculator extends Calculator{

    public int multiplication(int a, int b)
    {
        return a * b;
    }

    public int division(int a, int b)
    {
        return a / b;
    }

    public int modulo(int a, int b)
    {
        return a % b;
    }

    public static void main(String args[])
    {
        AccessModifierExample obj2 = new AccessModifierExample();

        obj2.c = 200;
    }


}
