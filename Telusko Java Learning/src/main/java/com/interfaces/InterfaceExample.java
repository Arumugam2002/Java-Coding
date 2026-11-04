package com.interfaces;

interface A{

    String name = "Arumugam Pandaram";
    String gender = "Male";

    void show();
    void delete();
}

interface D{

     void sing();


}

interface C extends D{

}

class B implements A,D{

    public void show()
    {
        System.out.println("This is show method");

    }

    public void delete()
    {
        System.out.println("This is delete method");
    }

    public void sing()
    {
        System.out.println("This is sing method");
    }



}

public class InterfaceExample {

    public static void main(String[] args)
    {


        B obj1 = new B();

        obj1.show();
        obj1.delete();
        obj1.sing();


        System.out.println(A.name);
        System.out.println(A.gender);
    }

}
