package com.RevisionApril2025.AnonymousInnerClass;

class A
{
    public void show()
    {
        System.out.println("In show in A...");
    }
}

class B extends A
{
    @Override
    public void show()
    {
        System.out.println("In show in B....");
    }
}

public class AnonymousInnerClass
{
    public static void main(String[] args)
    {
        A a1 = new A();

        a1.show();

        System.out.println();

        A a3 = new B();

        a3.show();

        System.out.println();

        A a2 = new A()
        {
            @Override
            public void show()
            {
                System.out.println("In new show in Anonymous Inner class....");
            }
        };

        a2.show();

    }
}
