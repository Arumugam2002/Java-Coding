package com.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourcesExample {

    public static void main(String[] args) throws IOException {
        int num = 0;

//        try{
//
//             br = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("Enter number:- ");
//            num = Integer.parseInt(br.readLine());
//            System.out.println(num);
//
//        }
//        finally {
//
//            br.close();
//        }

        //Try with Resources
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){


            System.out.println("Enter number:- ");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);

        }

    }
}
