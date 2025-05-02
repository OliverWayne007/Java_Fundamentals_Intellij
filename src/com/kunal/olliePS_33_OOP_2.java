package com.kunal;

public class olliePS_33_OOP_2 {

    public static void main(String[] args)
    {
        // In this tutorial we are going to work with constructors
        System.out.println("Constructors in Java !");

        // Constructor is a member function that always gets invoked when an object is created.
        // Constructors are used to initialize the object properties.
        // Constructors can not be static because they belong to the specific object and not to the class.
        // If no constructor is defined in the class then the default constructor is invoked.
        // The default constructor initializes the object properties with the default values based on
        // their respective data-types.

        Cat piddu = new Cat(4 , 2 , "meow");
        // Note that piddu is the reference variable that contains the value of the memory-address of
        // the actual object of the Cat class created in the memory

        System.out.println("legs: " + piddu.legs);
        System.out.println("ears: " + piddu.ears);
        System.out.println("sound: " + piddu.sound);
    }
}

class Cat
{
    // Number of legs
    int legs;
    // Number of ears
    int ears;
    // Sound
    String sound;

    // Parameterized Constructor
    Cat(int numOfLegs , int numOfEars , String catSound)
    {
        this.legs = numOfLegs;
        this.ears = numOfEars;
        this.sound = catSound;
    }
}
