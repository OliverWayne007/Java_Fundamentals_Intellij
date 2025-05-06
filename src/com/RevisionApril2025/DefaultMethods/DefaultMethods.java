package com.RevisionApril2025.DefaultMethods;

// Default methods in Java are methods defined within an interface that include a concrete implementation.
// Introduced in Java 8, they address the issue of adding new methods to an interface without
// breaking existing implementations. Before their introduction, adding a new method to an interface required all
// implementing classes to provide an implementation for that method, potentially causing widespread code breakage.

// Default methods are declared using the default keyword in the method signature within the interface.
// They provide a way to evolve interfaces while maintaining backward compatibility.
// Classes implementing the interface can either inherit the default implementation or override it
// with their own specific implementation.



@FunctionalInterface
interface FI
{
    // One and Only Abstract method
    void show();

    // Non-Generic Default method
    default void config()
    {
        System.out.println("In default method config  in FI.....");
    }

    // Default Generic method
    default <T> void display(T value)
    {
        System.out.println("In default generic method display in FI.....");
        System.out.println("Value: " + value);
    }
}

class FIImpl implements FI
{
    @Override
    public void show()
    {
        System.out.println("In show in FIImpl....");
    }

    @Override
    public void config()
    {
        System.out.println("In config in FIImpl.....");
    }
}

class AnonymousClass implements FI
{
    @Override
    public void show()
    {
        System.out.println("In show in AnonymousClass.....");
    }
}

public class DefaultMethods
{
    public static void main(String[] args)
    {
        // Using Anonymous Inner class
        FI aic = new FI()
        {
            @Override
            public void show()
            {
                System.out.println("In show in Anonymous Inner class....");
            }
        };

        aic.show();
        aic.config();
        aic.display("Bruce Wayne");

        System.out.println();

        // Using Lambda Expression
        FI fi = () -> {
            System.out.println("In show in Lambda expression....");
        };

        fi.show();
        fi.config();
        fi.display("Oliver Queen");

        System.out.println();

        // Basically, both Lambda Expression and Anonymous Inner class gets translated to the following
        // AnonymousClass behind the scenes.

        // Using the Traditional way
        FI ac = new AnonymousClass();

        ac.show();
        ac.config();
        ac.display(56.567);

        System.out.println();

        FI fiimpl = new FIImpl();

        fiimpl.config();
        fiimpl.show();
        fiimpl.display(1000);
    }
}
