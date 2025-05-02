package com.StaticInJava;

public class Main {
    public static void main(String[] args) {

        Human kunal = new Human(24 , "kunal" , 10000 , false);

        Human rahul = new Human(34 , "Rahul" , 20000 , true);

        Human arpit = new Human(23 , "Arpit" , 500000 , false);

        System.out.println("kunal.name: " + kunal.name);
        System.out.println("rahul.name: " + rahul.name);
        System.out.println("arpit.name: " + arpit.name);

        System.out.println("kunal.population: " + Human.population);
        System.out.println("rahul.population: " + Human.population);
        System.out.println("arpit.population: " + Human.population);

        // Cannot call non-static methods from a static context.
        // greeting();

        // We need to create instances of the class to access the non-static methods from a static context
        Main main = new Main();

        main.greeting();
        main.fun();
        main.fun2();

    }

    // Non-Static methods can be called from another non-static context
    void fun()
    {
        greeting();
    }

    // Static methods can be called from a non-static context
    void fun2()
    {
        abuse();
    }

    // Static method
    static void abuse()
    {
        System.out.println("I don't give a fuck about objects !!!");
    }

    // Non-Static method
    void greeting()
    {
        System.out.println("Hello, my name is Kunal !");
    }
}
