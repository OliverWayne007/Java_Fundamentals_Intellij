package com.kunal;

public class olliePS_35_OOP_4 {

    public static void main(String[] args)
    {
        System.out.println("Welcome to another tutorial on Object Oriented Programming !");

        Dog tommy = new Dog();

        System.out.println("tommy.legs: " + tommy.legs);
        System.out.println("tommy.ears: " + tommy.ears);
        System.out.println("tommy.sound: " + tommy.sound);

        Dog percy = tommy;

        System.out.println("percy.legs: " + percy.legs);
        System.out.println("percy.ears: " + percy.ears);
        System.out.println("percy.sound: " + percy.sound);

        percy.legs = 3;
        percy.ears = 1;

        System.out.println("percy.legs: " + percy.legs);
        System.out.println("percy.ears: " + percy.ears);
        System.out.println("percy.sound: " + percy.sound);

        System.out.println("tommy.legs: " + tommy.legs);
        System.out.println("tommy.ears: " + tommy.ears);
        System.out.println("tommy.sound: " + tommy.sound);

        // Here, both reference variables tommy and percy contain the value of the memory-address of the
        // same object of the Dog class. Therefore, any change made to the object using the percy reference
        // is also reflected in the tommy reference.
    }
}

class Dog
{
    // Number of legs
    int legs;
    // Number of ears
    int ears;
    // Sound
    String sound;

    // Non-Parameterised constructor
    Dog()
    {
        this.legs = 4;
        this.ears = 2;
        this.sound = "bark";
    }
}
