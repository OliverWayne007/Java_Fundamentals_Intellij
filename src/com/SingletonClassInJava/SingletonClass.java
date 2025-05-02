package com.SingletonClassInJava;

// A Singleton class is a class which can be instantiated exactly once

// Let's see how to implement a Singleton class

// A Singleton class has a private constructor so that users cannot create objects of the class
// as the constructor is not public.

// The getInstance() method is static because in order to access the getInstance() method without any
// object of the class it has to be static.

// The getInstance() method is public so that users can call the getInstance() method using the
// class name directly. Had it been private, it would not have been accessible by using the class name also.

public class SingletonClass {

    private SingletonClass() {}

    private static SingletonClass instance;

    public static SingletonClass getInstance()
    {
        if(instance == null)
        {
            instance = new SingletonClass();
        }

        return instance;
    }

}