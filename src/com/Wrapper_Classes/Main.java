package com.Wrapper_Classes;

public class Main {

    public static void main(String[] args) {

        int a = 10;  // int is a primitive type

        // The following syntax has been deprecated
        // Integer b = new Integer(a);  // This is called Boxing

        // Boxing refers to explicitly converting a primitive datatype to an object Wrapper datatype

        // The following is the supported syntax
        Integer c = a;  // This is called Autoboxing

        // Autoboxing is the automatic conversion that the Java compiler makes between the
        // primitive types and their corresponding object wrapper classes.

        System.out.println("The value of c is: " + c);

        Integer d = 20;

        int e = d.intValue();  // Unboxing

        int f = d;  // AutoUnboxing

        System.out.println("The value of e is: " + e);
        System.out.println("The value of f is: " + f);

        //  String to integer using wrapper classes
        String str = "12";
        int num = Integer.parseInt(str);
        System.out.println(num * 2);
    }
}
