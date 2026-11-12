package com.exceptions;

import java.util.*;
import java.util.Scanner;

public class TryCatchExample {
    
    
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
        }
        catch (Exception e)
        {
            System.out.println("Logical Error found in code. Please fix that error" + e);
        }
        
        System.out.println(result);
        
        System.out.println("Code has been executed successfully");
    }
    
}
