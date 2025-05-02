package com.Anonymous_Inner_Class;


class A
{
    void show()
    {
        System.out.println("In show in A....");
    }
}

class B extends A
{
    @Override
    void show()
    {
        System.out.println("In show in B....");
    }
}

public class Main {

    public static void main(String[] args) {

        A obj1 = new A();

        obj1.show();

        System.out.println();

        A obj2 = new B();

        obj2.show();

        System.out.println();

        A obj3 = new A()
        {
            @Override
            void show()
            {
                System.out.println("In show in anonymous inner class....");
            }
        };

        obj3.show();

    }

}
