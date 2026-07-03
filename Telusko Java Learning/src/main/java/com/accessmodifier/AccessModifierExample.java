package com.accessmodifier;

public class AccessModifierExample {

    private int a;

    protected int b;

    public int c;

    public void setA(int a)
    {
        this.a = a;

    }
    public int getA()
    {
        return a;
    }

    public static void main(String[] args)
    {
        AccessModifierExample obj1 = new AccessModifierExample();

        obj1.a = 10;

        System.out.print(obj1.a);
    }

}
