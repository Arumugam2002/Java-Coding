package com.dynamicmethoddispatch;

class A{

    public void display()
    {
        System.out.println("This is method A");
    }



}

class B extends A{
    public void display()
    {
        System.out.println("This is method B");
    }
}

class C extends B{
    public void display()
    {
        System.out.println("This is method C");
    }
}





public class DynamicMethodDispatch {

    public static void main(String[] args)
    {
        A obj1 = new A();
        obj1.display();


        obj1 = new B();

        obj1.display();

        obj1 = new C();

        obj1.display();


    }


}
