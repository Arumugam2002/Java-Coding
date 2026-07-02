package com.statickeywordlearning;

class Cars{

    String brandName;
    int price;
    static String vehicleName;


    static {
        vehicleName = "Car";

        System.out.println("Static Block has been called");
    }

    public Cars()
    {
        brandName = "AstonMartinDB9";
        price = 3000000;

        System.out.println("Constructor is being called");

    }

    public void getCarDetails()
    {
        System.out.println("Brand Name:- " + brandName + " price:- " + price + " Vehicle Name:- " + vehicleName);
    }

    public static void getCarDetails1(Cars object1)
    {
        System.out.println("Brand Name:- " + object1.brandName + " price:- " + object1.price + " Vehicle Name:- " + vehicleName);
    }

}



public class StaticKeywordLearning {

    public static void main(String[] args)
    {
       Cars car1 = new Cars();



       car1.brandName = "Lamborghini";
       car1.price = 3000000;
       Cars.vehicleName = "Car";

       car1.getCarDetails();

        Cars car2 = new Cars();

        car2.brandName = "Mercedes";
        car2.price = 2000000;
        Cars.vehicleName = "Car";

        car2.getCarDetails();

        Cars car3 = new Cars();

        car3.brandName = "Porsche";
        car3.price = 4000000;
        Cars.vehicleName = "Car";


       

        car3.getCarDetails();

        Cars.getCarDetails1(car1);


    }


}
