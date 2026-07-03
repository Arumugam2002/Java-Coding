package com.accessmodifier;

public class AnotherAccessModifierExample extends AccessModifierExample{

    public static void main(String[] args)
    {
        AnotherAccessModifierExample obj1 = new AnotherAccessModifierExample();

        obj1.b = 110;

        System.out.println(obj1.b);
    }

}
