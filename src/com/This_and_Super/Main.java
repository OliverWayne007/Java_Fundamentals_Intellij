package com.This_and_Super;

public class Main {

    public static void main(String[] args) {

        System.out.println("In this tutorial we are going to look into the this and super keyword !");

        C obj = new C(16);
    }
}

// By default, the super() method is always invoked by every constructor of every class internally
// and implicitly if no super() or this() method is invoked by the programmer explicitly.
// This super() method invokes the default constructor of the super-class/parent-class.
// We can explicitly use the super() method to call/invoke the default constructor of the immediate parent class.
// We can explicitly use the super(<argument>) method to call/invoke the parameterised constructor
// of the immediate parent class.
// The this() method is used to invoke the default/non-parameterised constructor of the current class.
// The this(<argument>) method is used to invoke the parameterised constructor of the current class.

class A
{
    A()
    {
        super();
        System.out.println("The default constructor of class A is invoked !!!");
    }

    A(int x)
    {
        super();
        System.out.println("The parameterised constructor of class A is invoked !!!");
    }
}

class B extends A
{
    B()
    {
        super(10);
        System.out.println("The default constructor of class B is invoked !!!");
    }
}

class C extends B
{
    C()
    {
        super();
        System.out.println("The default constructor of class C is invoked !!!");
    }

    C(int x)
    {
        this();
        System.out.println("The parameterised constructor of class C is invoked !!!");
    }
}
