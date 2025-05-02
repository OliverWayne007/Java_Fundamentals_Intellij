package com.RevisionApril2025.Abstract_and_AnonymousInnerClass;

abstract class A
{
    public abstract void show();
    public abstract void config();
}

public class Abstract_and_AnonymousInnerClass
{
    public static void main(String[] args)
    {
        A a = new A()
        {
            @Override
            public void show()
            {
                System.out.println("In show in Anonymous Inner class...");
            }

            @Override
            public void config() {
                System.out.println("In config in Anonymous Inner class...");
            }
        };

        a.show();
        a.config();
    }
}
