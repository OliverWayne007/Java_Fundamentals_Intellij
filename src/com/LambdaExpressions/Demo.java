package com.LambdaExpressions;

@java.lang.FunctionalInterface
interface Cab
{
    void bookCab();
}

class Ola implements Cab
{
    @Override
    public void bookCab()
    {
        System.out.println("Your cab has been booked from Bangalore to Bhilai....");
    }
}

public class Demo {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("This is the demo class !");

        // Implementing the Functional Interface the traditional way
        Cab cab1 = new Ola();
        cab1.bookCab();

        // Implementing the Functional Interface using Anonymous Inner class
        Cab cab2 = new Cab()
        {
            @Override
            public void bookCab()
            {
                System.out.println("Your cab has been booked from Bangalore to Bhilai....");
            }
        };

        cab2.bookCab();

        // Implementing the Functional Interface using Lambda Expressions
        Cab cab3 = () -> {
            System.out.println("Your cab has been booked from Bangalore to Bhilai....");
        };

        cab3.bookCab();

    }
}
