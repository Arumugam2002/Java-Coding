package com.innerclass;


class AOne{

    public void display()
    {
        System.out.println("This is display method of A");
    }
}

public class AnonymousInnerClass {

    public static void main(String[] args)
    {
        AOne obj1 = new AOne()
        {
            public void display()
            {
                System.out.println("This is updated version of method display");
            }


        };

        obj1.display();

    }
}
