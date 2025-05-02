package com.MutableObjectsInJava;

public class MutableObjects {

    public static void main(String[] args) {

        System.out.println("In this tutorial we are going to learn about mutable objects in Java");

        Student arpit = new Student("Arpit Singh" , 16 , 23);

        arpit.displayInfo();

        // Note that every object has a unique hashcode
        System.out.println(arpit);

        arpit.age = 24;

        arpit.displayInfo();

        // Keep in mind that every object has a unique hashcode
        System.out.println(arpit);

        // It is important to note that the hashcode remains the same after modifying the roll property
        // of the student object arpit. This means that the actual object itself is getting changed in the
        // memory and no new object is being created. This proves the point that the arpit object of the
        // student class is mutable.

    }
}

class Student
{
    // Name of the student
    String name;
    // Roll number of the student
    int roll;
    // Age of the student
    int age;

    // Parameterised Constructor
    Student(String name , int roll , int age)
    {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    // Display properties
    void displayInfo()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Roll number: " + this.roll);
        System.out.println("Age: " + this.age);
    }
}