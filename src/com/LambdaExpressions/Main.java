package com.LambdaExpressions;

@java.lang.FunctionalInterface
interface FunctionalInterface
{
    void show();
}

class A implements FunctionalInterface
{
    @Override
    public void show()
    {
        System.out.println("In show in A.....");
    }
}

public class Main {

    public static void main(String[] args) {

        // Implementing the functional interface the traditional way
        FunctionalInterface obj1 = new A();
        obj1.show();

        System.out.println();

        // Implementing the functional interface by using anonymous inner classes
        FunctionalInterface obj2 = new FunctionalInterface()
        {
            @Override
            public void show()
            {
                System.out.println("In show in anonymous inner class....");
            }
        };

        obj2.show();

        System.out.println();

        // Implementing the functional interface by using lambda expressions
        FunctionalInterface obj3 = () -> {
            System.out.println("In show in lambda expression....");
        };

        obj3.show();

    }

}
