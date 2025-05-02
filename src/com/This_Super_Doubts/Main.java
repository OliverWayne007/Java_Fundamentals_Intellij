package com.This_Super_Doubts;

class A
{
    public int age;

    public void show()
    {
        System.out.println("This is the show function of the A class");
    }

    A(int age)
    {
        this.age = age;
    }

    A()
    {
        System.out.println("This is the default constructor of class A");
    }
}

class B extends A
{
    private int age = 16;

    private int marks;

    private String name;

    public void getName()
    {
        System.out.println("Name: " + this.name);
    }

    public void getThisAge()
    {
        System.out.println("this.age: " + this.age);
    }

    public void getSuperAge()
    {
        System.out.println("super.age: " + super.age);
    }

    public void getMarks()
    {
        System.out.println("this.marks: " + this.marks);
    }

    B(String name , int age , int marks)
    {
        super(age);
        this.name = name;
        this.marks = marks;
    }

    B()
    {
        System.out.println("This is a default constructor of class B");
    }
}

public class Main {
    public static void main(String[] args) {

        A a = new A();
        System.out.println("a.age: " + a.age); // 0

        System.out.println();

        B b = new B("Arpit Singh" , 23 , 95);
        b.getThisAge(); // 16
        b.getSuperAge(); // 23

        System.out.println();

        System.out.println("a.age: " + a.age); // 0

        System.out.println();

        A a1 = new A();
        System.out.println("a1.age: " + a1.age); // 23

        System.out.println();

        B b1 = new B();

        b1.getSuperAge(); // 0
        b1.getThisAge(); // 16
        b1.getMarks(); // 0

        System.out.println();

    }
}
