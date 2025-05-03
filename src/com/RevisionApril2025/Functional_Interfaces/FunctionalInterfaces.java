package com.RevisionApril2025.Functional_Interfaces;

// A Functional Interface is an interface having only one public abstract function.

@FunctionalInterface
interface I
{
    public abstract void show();
}

class A implements I
{
    @Override
    public void show()
    {
        System.out.println("In show in A...");
    }
}

public class FunctionalInterfaces
{
    public static void main(String[] args)
    {
        // Using a traditional class to implement the Functional Interface I
        I i1 = new A();

        i1.show();

        System.out.println();

        // Using an Anonymous inner class to implement the Functional Interface I
        I i2 = new I()
        {
            @Override
            public void show()
            {
                System.out.println("In show in Anonymous Inner class....");
            }
        };

        i2.show();

        System.out.println();

        // Using Lambda Expression to implement the Functional Interface I
        // Note: Lambda Expressions can only be used to implement Functional Interfaces
        I i3 = () -> System.out.println("In show in Lambda expression...");

        i3.show();
    }
}
