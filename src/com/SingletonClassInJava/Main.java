package com.SingletonClassInJava;

public class Main {

    public static void main(String[] args) {

        SingletonClass a = SingletonClass.getInstance();

        SingletonClass b = SingletonClass.getInstance();

        SingletonClass c = SingletonClass.getInstance();

        // Note that all a , b , c will refer to the same object/instance of the Singleton class
        // as only one object/instance is available and that same object/instance is being returned
        // by the getInstance() method.

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

    }
}
