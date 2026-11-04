package com.enumexample;

enum Season{
    Summer, Winter, Monsoon, Spring, Autumn
}

public class EnumExample {

    public static void main(String[] args)
    {
        Season name = Season.Spring;

        switch (name)
        {
            case Summer:
                System.out.println("Season is Summer");
                break;

            case Winter:
                System.out.println("Season is Winter");
                break;

            case Monsoon:
                System.out.println("Season is Monsoon");
                break;

            case Spring:
                System.out.println("Season is Spring");
                break;

            case Autumn:
                System.out.println("Season is Autumn");
                break;


            default: System.out.println("Invalid Output");
        }


//        for(Season s : name)
//        {
//            System.out.println(s + " :- " + s.ordinal());
//        }

//        if(name == Season.Summer)
//        {
//            System.out.println("Season is Summer");
//        }
//
//        else if(name == Season.Winter)
//        {
//            System.out.println("Season is Winter");
//        }
//
//
//        else if(name == Season.Monsoon)
//        {
//            System.out.println("Season is Monsoon");
//        }
//
//
//        else if(name == Season.Spring)
//        {
//            System.out.println("Season is Spring");
//        }
//
//
//        else if(name == Season.Autumn)
//        {
//            System.out.println("Season is Autumn");
//        }
//
//        else {
//            System.out.println("Invalid Output");
//        }
    }
}
