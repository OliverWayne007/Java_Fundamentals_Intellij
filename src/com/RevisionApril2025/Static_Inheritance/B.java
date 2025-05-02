package com.RevisionApril2025.Static_Inheritance;

class B extends A
{
    // @Override
    static String name = "Oliver Queen";

    // @Override
    int x = 100;

    @Override
    void show()
    {
        System.out.println("In show in B....");
    }

    // @Override
    static void config()
    {
        System.out.println("In config in B....");
    }
}
