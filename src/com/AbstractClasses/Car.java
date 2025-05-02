package com.AbstractClasses;

public abstract class Car {

     public abstract void drive();

     public abstract void fly();

    public void playMusic()
    {
        System.out.println("Playing Music....");
    }
}

// Note: An abstract class can have both abstract and concrete methods.
// This means that an abstract class can have:
// 1. both abstract and concrete methods
// 2. only abstract methods
// 3. only concrete methods

// An abstract class cannot be instantiated.
