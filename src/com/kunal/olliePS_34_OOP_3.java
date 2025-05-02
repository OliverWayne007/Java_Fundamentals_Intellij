package com.kunal;

public class olliePS_34_OOP_3 {

    public static void main(String[] args)
    {
        // In this tutorial we will discuss constructor overloading and stuff
        System.out.println("Let's discuss about constructor overloading !!!");

        Person ankit = new Person();  // In this case, the non-parameterised constructor is invoked

        System.out.println("ankit.name: " + ankit.name);
        System.out.println("ankit.city: " + ankit.city);
        System.out.println("ankit.age: " + ankit.age);

        Person arpit = new Person("Arpit Singh" , "Bhilai Nagar" , 24);
        // In this case, the parameterised constructor is invoked

        System.out.println("arpit.name: " + arpit.name);
        System.out.println("arpit.city: " + arpit.city);
        System.out.println("arpit.age: " + arpit.age);

    }
}

class Person
{
    // Name of the person
    String name;

    // City of the person
    String city;

    // Age of the person
    int age;

    // Constructor Overloading:

    // Non-parameterised constructor
    Person()
    {
        this.name = "Oliver Queen";
        this.age = 23;
        this.city = "Bhilai";
    }

    // Parameterized constructor
    Person(String name , String city , int age)
    {
        this.name = name;
        this.city = city;
        this.age = age;
    }

}
