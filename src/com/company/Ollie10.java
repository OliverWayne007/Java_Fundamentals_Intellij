package com.company;
// SINGLE INHERITANCE TUTORIAL
class Parent1
{
    int a = 10;
    void display()
    {
        System.out.println("iam display() function of Parent1 class !!!");
    }
    Parent1()   // DEFAULT CONSTRUCTOR OF PARENT CLASS
    {
        System.out.println("Default Constructor of Parent1 class is invoked !!!");
    }
}

class Child1 extends Parent1
{
    int b = 20;
    void show()
    {
        System.out.println("iam show() function of child1 class !!!");
    }
    Child1()   // DEFAULT CONSTRUCTOR OF CHILD CLASS
    {
        System.out.println("Default Constructor of Child1 class is invoked !!!");
    }
}

public class Ollie10 {

    public static void main(String[] args)
    {
        // CREATING AN OBJECT OF THE Child1 CLASS
        Child1 obj = new Child1();
        // ACCESSING THE INSTANCE VARIABLE OF Child1 CLASS USING THE OBJECT OF Child1 CLASS
        System.out.println("The value of b is: " + obj.b);
        // ACCESSING THE INSTANCE VARIABLE OF Parent1 CLASS USING THE OBJECT OF Child1 CLASS
        System.out.println("The value of a is: " + obj.a);
        // ACCESSING THE METHOD OF Child1 CLASS USING THE OBJECT OF Child1 CLASS
        obj.show();
        // ACCESSING THE METHOD OF Parent1 CLASS USING THE OBJECT OF Child1 CLASS
        obj.display();

        // NOTE: THE DEFAULT CONSTRUCTOR OF THE Parent1 CLASS IS IMPLICITLY INVOKED BY THE JVM EVEN WHEN
        // NO OBJECT OF THE Parent1 CLASS HAS BEEN CREATED.
        // ALSO NOTE THAT THE DEFAULT CONSTRUCTOR OF THE Parent1 CLASS IS EXECUTED BEFORE THE DEFAULT CONSTRUCTOR
        // OF THE Child1 CLASS.
    }
}
