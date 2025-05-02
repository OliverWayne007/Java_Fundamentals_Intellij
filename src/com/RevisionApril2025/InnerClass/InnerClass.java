package com.RevisionApril2025.InnerClass;

class A
{
    int age = 44;

    public void config()
    {
        System.out.println("In config in A...");
    }

    // Non-Static Inner class B
    class B
    {
        void show()
        {
            System.out.println("In show in B...");
        }
    }

    // Static Inner class C
    static class C
    {
        void display()
        {
            System.out.println("In display in C...");
        }
    }
}

public class InnerClass
{
    public static void main(String[] args)
    {
        A a = new A();

        System.out.println("a.age: " + a.age);

        a.config();

        // In case of a non-static inner class, an object of the Outer class is required to create an instance
        // of the non-static inner class as non-static elements belong to an object and not to the class
        A.B b = a.new B();

        b.show();

        // In case of static inner class, object of the Outer class is not required to create an instance
        // of the static inner class as static elements belong to the class and not the object.
        A.C c = new A.C();

        c.display();
    }
}
