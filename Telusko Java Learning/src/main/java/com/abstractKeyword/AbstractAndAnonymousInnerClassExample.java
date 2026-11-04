package com.abstractKeyword;


abstract class A{

    public abstract void display();
    public abstract void delete();

}

class B extends A{


    @Override
    public void display() {
        System.out.println("Display method");
    }

    @Override
    public void delete() {
        System.out.println("This method has been deleted");
    }
}

public class AbstractAndAnonymousInnerClassExample {

    public static void main(String[] args) {
        A obj1 = new A() {

        public void display () {
            System.out.println("Display method");
        }

        public void delete() {
            System.out.println("This method delete has been overwritten");
        }
    };
        obj1.display();
        obj1.delete();


    }
}
