package com.Polymorphism;

public class Child extends Parent{

    // It is important to note that data members are neither overloaded nor overridden.
    // The concept of polymorphism only applies to methods and not variables.

    // @Override
    int age = 24;

    @Override
    void fun()
    {
        System.out.println("Playing video games and watching movies !!!");
    }

    // Note that static methods cannot be overridden in the child class as they do not depend on objects.

    //@Override
    static void musicTaste()
    {
        System.out.println("Fast track music and raps !!!");
    }

    void dressingSense()
    {
        System.out.println("Modern, tight fits !!!");
    }

}
