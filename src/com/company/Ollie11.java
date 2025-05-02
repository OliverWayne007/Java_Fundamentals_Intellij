package com.company;

class Parent2
{
    int a = 10;
    void display()
    {
        System.out.println("iam display() method of the Parent2 class !!!");
    }

    Parent2()
    {
        System.out.println("Default Constructor of Parent2 class is invoked !!!");
    }

    Parent2(int x , int y)
    {
        System.out.println("The value of x+y is: " + (x+y));
    }
}

class Child2 extends Parent2
{
    int b = 20;
    void show()
    {
        System.out.println("iam show() method of the Child2 class !!!");
    }
    Child2()
    {
        System.out.println("Default Constructor of Child2 class is invoked !!!");
    }
}

public class Ollie11 {

    public static void main(String[] args)
    {
        Child2 obj = new Child2();
        System.out.println("The value of a is: " + obj.a);
        System.out.println("The value of b is: " + obj.b);
    }
}
