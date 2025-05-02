package com.MethodOverridingInJava;

public class Main {

    public static void main(String[] args) {

        System.out.println("In this tutorial we are going to look into Method Overriding in Java !");

        B obj = new B();

        obj.show();
        // Note that the show() method of child class B overrides the show() method of parent class A
        obj.config();
        // Here, since config() method is only present in the parent class A, it is invoked.

        // Therefore, we can see that method overriding allows the child class to have properties
        // and behaviors of their own. It allows them to have their own implementations of methods.

        A obj1 = new A();
        obj1.show();

        A obj2 = new B();
        obj2.show();
    }
}

class A
{
    public void show()
    {
        System.out.println("This is the show function of class A");
    }

    public void config()
    {
        System.out.println("This is the config function of class A");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("This is the show function of class B");
    }
}
