package com.enumexample;

enum Mobiles{

    Xiaomi(20000), Oneplus(25000), Iphone, Realme(28000), Vivo(15000);

    private int price;

    private Mobiles()
    {
        price = 2000;
        System.out.println("This is a default constructor");
    }

    private Mobiles(int price)
    {
        this.price = price;
        System.out.println("This is a parameterized constructor");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class AnotherEnumExample {

    public static void main(String[] args)
    {
//        Mobiles mobileName = Mobiles.Oneplus;
//
//        System.out.println(mobileName.getPrice());

          for(Mobiles name : Mobiles.values())
          {
              System.out.println(name + " :- " + name.getPrice());
          }
    }
}
