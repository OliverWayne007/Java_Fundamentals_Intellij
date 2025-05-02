package com.Polymorphism;

public class Main {

    public static void main(String[] args) {

        Parent p = new Parent();

        Child c = new Child();

        Parent p1 = new Child();

        p.fun();

        c.fun();

        c.dressingSense();

        // If we use a parent class reference variable to refer to a child class object, we will not be
        // able to access the properties and methods that are present only in the child class. Only those
        // methods which are present in both child and parent class are accessible through a reference variable
        // of parent class type. This is why the below line shows an error as there is no dressingSense()
        // function in the parent class.

        // p1.dressingSense();

        // Very Important:
        // Runtime/Dynamic polymorphism is achieved through method overriding.
        // In case of method overriding, the type of the reference variable determines which data members
        // and member functions are "accessible" through the reference variable whereas, on the other hand,
        // it is the type of the created object that the reference variable refers to, that determines
        // which version i.e the parent class version or the child class version of the "accessible" methods
        // will be invoked. This means that the function call is bound to the type of the object being
        // created at the runtime.

        // In the below example, the reference variable p1 is of type Parent. So, p1 only has access to those
        // methods which are present in the Parent class i.e fun() and musicTaste(). p1 does not have access to
        // the dressingSense() method. This is why when we try to access the dressingSense() method through
        // p1 above, it throws an error.
        // Now, since p1 has access to fun() and it is the type of the object that determines which version
        // of the function will be invoked, since the object is of type Child class, the fun() method of
        // the child class is invoked as can be seen below.

        p1.fun();

        // Since static methods are not overridden, in case of static methods, the function call is bound
        // to the type of the reference variable at compile time.

        // Here, the static method musicTaste() of the parent class is invoked because the reference variable
        // p is of type parent.
        p.musicTaste();

        // Here, the static method musicTaste() of the parent class is invoked because the reference variable
        // p1 is of type parent. It does not matter that p1 actually refers to an object if type child.
        p1.musicTaste();

    }
}
