package com.RevisionApril2025.AbstractKeyword;

abstract class Car
{
    public abstract void drive();

    public void playMusic()
    {
        System.out.println("Playing music....");
    }

    public abstract void fly();
}

abstract class WagonR extends Car
{
    @Override
    public void drive()
    {
        System.out.println("Driving WagonR....");
    }

    // public abstract void fly();
}

class ExtendedWagonR extends WagonR
{
    @Override
    public void fly()
    {
        System.out.println("Flying....");
    }
}

// Abstract classes cannot be instantiated.

// Abstract can have both abstract and concrete methods.

// Any child class extending an Abstract class needs to implement the abstract methods of the Abstract class
// otherwise the child class also becomes an Abstract class.

// It is possible to create a reference of an Abstract class but not an instance of the Abstract class.

public class AbstractKeyword
{
    public static void main(String[] args)
    {
        Car car = new ExtendedWagonR();

        car.drive();
        car.playMusic();
        car.fly();
    }
}
