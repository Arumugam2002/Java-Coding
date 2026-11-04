package com.annotation;

class A{

    public void displayThisMethodBelongsToThisClass()
    {
        System.out.println("This is method A display");
    }


}

class B extends A{

    @Override
    public void displayThisMethodBelongsToThisClass()
    {
        System.out.println("This is method B display");
    }
}


public class AnnotationExample {

    public static void main(String[] args)
    {
        B obj1 = new B();
        obj1.displayThisMethodBelongsToThisClass();
    }

}
