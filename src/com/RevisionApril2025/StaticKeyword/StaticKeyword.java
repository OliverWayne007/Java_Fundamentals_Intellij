package com.RevisionApril2025.StaticKeyword;

class Mobile
{
    static String category = "SmartPhone";
    String brand;
    int price;

    public Mobile(String brand , int price)
    {
        this.brand = brand;
        this.price = price;
    }

    public void display()
    {
        System.out.println("Category: " + category + " ---> Brand: " + this.brand + " ---> Price: " + this.price);
    }

    // Cannot use Non-Static variables and Non-Static methods inside a Static method
//    public static void show()
//    {
//        System.out.println("Category: " + category + " ---> Brand: " + this.brand + " ---> Price: " + this.price);
//    }
}

public class StaticKeyword
{
    public static void main(String[] args)
    {
        Mobile mobile1 = new Mobile("Apple" , 1800);
        Mobile mobile2 = new Mobile("Samsung" , 1500);

        mobile1.display();
        mobile2.display();

        Mobile.category = "Phone";

        mobile1.display();
        mobile2.display();
    }
}
