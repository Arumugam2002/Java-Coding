package com.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderScannerExample {

    public static void main(String[] args)
    {
        System.out.println("Enter number:- ");

//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
            System.out.println(num);
//        try{
//
//        }
//        catch(IOException e)
//        {
//            System.out.println("IO Exception has been occured" + e);
//            e.printStackTrace();
 //    }

sc.close();
    }

}
