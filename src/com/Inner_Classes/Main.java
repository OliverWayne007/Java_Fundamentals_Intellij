package com.Inner_Classes;

class A
{
    int age;

    static void aboutA()
    {
        System.out.println("A is the outer class.");
    }

    public void show()
    {
        System.out.println("In show in A....");
    }

    // This is a non-static inner class
    class B
    {
        int innerClassVariableOfB;

        static void aboutB()
        {
            System.out.println("B is an inner class inside class A.");
        }

        public void configB()
        {
            System.out.println("In config in B...");
        }

        B(int innerClassVariableOfB)
        {
            this.innerClassVariableOfB = innerClassVariableOfB;
        }
    }

    // This is a static inner class
    static class C
    {
        int innerClassVariableOfC;

        static void aboutC()
        {
            System.out.println("C is a static inner class inside class A.");
        }

        public void configC()
        {
            System.out.println("In config in C...");
        }

        C(int innerClassVariableOfC)
        {
            this.innerClassVariableOfC = innerClassVariableOfC;
        }
    }

    A(int age)
    {
        this.age = age;
    }
}

public class Main {

    public static void main(String[] args) {

        A obj = new A(23);
        A.aboutA();
        System.out.println("age: " + obj.age);
        obj.show();

        System.out.println();

        // Static methods can be called without any object of the class
        A.B.aboutB();

        // Creating an object of non-static inner class B
        A.B ab = obj.new B(16);

        System.out.println(ab.innerClassVariableOfB);
        ab.configB();

        System.out.println();

        // Static methods can be called without any object of the class
        A.C.aboutC();

        // Creating an object of static inner class C
        A.C ac = new A.C(16);

        System.out.println(ac.innerClassVariableOfC);
        ac.configC();

    }
}

