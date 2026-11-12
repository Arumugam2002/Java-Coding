package com.exceptions;

import java.util.Scanner;

public class ThrowKeywordExample {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number1, number2, result = 0;




        System.out.print("Enter number 1:- ");
        number1 = sc.nextInt();

        System.out.print("Enter number 2:- ");
        number2 = sc.nextInt();

        try
        {
            result = number1/number2;

            if(result == 0)
            {
                throw new ArithmeticException("Zero should not be printed");
            }

        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide Zero" + e);
            result = number1/1;
            System.out.println("Thats the default output2" + e);

        }
        catch(Exception e)
        {
            System.out.println("Logical Error in code. Please fix that code" + e);
        }

        System.out.println(result);

        System.out.println("Code has been executed successfully");
    }

}
