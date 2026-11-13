package com.exceptions;

class ExampleOne
{
    public void show() throws ClassNotFoundException
    {

        Class.forName("ThrowsKeywordExample");

//        try{
//
//        }
//        catch(ClassNotFoundException e)
//        {
//            System.out.println("Unable to fetch the class" + e);
//        }
    }
}
public class ThrowsKeywordExample {

    static{
        System.out.println("Class has been loaded");
    }

    public static void main(String[] args)
    {
        ExampleOne obj1 = new ExampleOne();

        try{
            obj1.show();
        }catch(ClassNotFoundException e)
        {
            System.out.println("Class Not found error found" + e);

            e.printStackTrace();
        }


    }
}
