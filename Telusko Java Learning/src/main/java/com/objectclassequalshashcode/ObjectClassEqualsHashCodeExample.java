package com.objectclassequalshashcode;

import java.util.Objects;

class ExampleA{

    public int brandPrice;
    public String brandName;

//    public String toString()
//    {
//        return "Washing Machine Brand:- " + brandName + " and Washing Machine Price:- " + brandPrice;
//    }

//    public boolean equals(ExampleA that)
//    {
//        return this.brandName.equals(that.brandName) && this.brandPrice == that.brandPrice;
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ExampleA exampleA = (ExampleA) o;
        return brandPrice == exampleA.brandPrice && Objects.equals(brandName, exampleA.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandPrice, brandName);
    }

    @Override
    public String toString() {
        return "ExampleA{" +
                "brandPrice=" + brandPrice +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}


public class ObjectClassEqualsHashCodeExample {

    public static void main(String[] args)
    {
        ExampleA objA = new ExampleA();

        objA.brandName = "Whirlpool";
        objA.brandPrice=10000;



        System.out.println(objA);

        ExampleA objB = new ExampleA();

        objB.brandPrice = 10000;
        objB.brandName = "Whirlpool";

        System.out.println(objB);

        boolean result = objA.equals(objB);

        System.out.println(result);

        System.out.println(objA == objB);
    }

}
