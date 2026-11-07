package com.interfaces;


@FunctionalInterface
interface Calculator{

    int  addition(int i, int j);


}

//class Dog implements Animal{
//    @Override
//    public void sound()
//    {
//        System.out.println("Dog is barking");
//    }
//
//}


public class LambdaExpressionWithReturn {

    public static void main(String[] args)
    {
//        Calculator calculator1 = new Calculator() {
//            @Override
//            public int addition(int i, int j) {
//                return i + j;
//            }
//        };
//
//        int results = calculator1.addition(10,90);
//
//        System.out.println(results);

        Calculator calculator1 =   (i,  j) -> i+ j;

        ;

        int results = calculator1.addition(10,90);

        System.out.println(results);
    }

}
