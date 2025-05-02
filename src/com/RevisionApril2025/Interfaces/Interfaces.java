package com.RevisionApril2025.Interfaces;

// Unlike an Abstract class which can have both Abstract and Concrete methods, an Interface can only have
// Abstract methods.

// All the methods in an Interface are by default public and abstract.

// All the variables in an interface are by default static and final.

// Since all the variables in an interface are final and static,
// 1. All the variables have to defined as when they are declared as they are final.
// 2. All the variables can be accessed using the interface name as they belong to the interface.

// Interfaces like Abstract classes cannot be instantiated.

// Like an Abstract class, it is possible to create a reference of Interfaces.

// Any class that implements an Interface needs to implement all the methods declared in the interface.

interface A
{
    int age = 10;

    public abstract void show();

    void config();
}

// Traditional way of implementing an interface
class B implements A
{
    @Override
    public void show()
    {
        System.out.println("In show in B...");
    }

    @Override
    public void config()
    {
        System.out.println("In config in B...");
    }
}

public class Interfaces
{
    public static void main(String[] args)
    {
        A a1 = new B();

        a1.config();
        a1.show();

        System.out.println("a1.age: " + a1.age);

        System.out.println();

        // Implementing an interface using Anonymous Inner class
        A a2 = new A()
        {
            @Override
            public void show()
            {
                System.out.println("In show in Anonymous Inner class...");
            }

            @Override
            public void config()
            {
                System.out.println("In config in Anonymous Inner class");
            }
        };

        a2.show();
        a2.config();

        System.out.println();

        System.out.println("A.age: " + A.age);

    }
}
