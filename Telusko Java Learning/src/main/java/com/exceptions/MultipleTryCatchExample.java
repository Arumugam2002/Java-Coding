package com.exceptions;
import java.util.*;

import java.util.Scanner;

public class MultipleTryCatchExample {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number1, number2, result = 0;

        int[] nums = new int[5];
        String name = null;


        System.out.print("Enter number 1:- ");
        number1 = sc.nextInt();

        System.out.print("Enter number 2:- ");
        number2 = sc.nextInt();

        try
        {
            result = number1/number2;
            System.out.println(nums[1]);


            System.out.println(name.length());
            System.out.println(nums[5]);

        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide Zero" );


        }

        catch(ArrayIndexOutOfBoundsException e)
        {

            System.out.println("Array Index Out of Bounds");
         }
        catch(Exception e)
        {
            System.out.println("Logical Error in code. Please fix that code" + e);
        }

        System.out.println(result);

        System.out.println("Code has been executed successfully");
    }

}
