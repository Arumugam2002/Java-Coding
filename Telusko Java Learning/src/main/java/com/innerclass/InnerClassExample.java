package com.innerclass;

class A{

    public void show()
    {
        System.out.println("It is A method");
    }


      class B{

        public void display()
        {
            System.out.println("It is B method");
        }


    }

}


public class InnerClassExample {


        public static void main(String[] args)
        {
            A obj1 = new A();

            obj1.show();

            A.B obj2 = obj1.new B();

            obj2.display();
        }
}
