package com.multipleinheritance;

import com.inheritance.Calculator;

public class AdvancedCalculator extends Calculator {

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


}