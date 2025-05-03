package com.RevisionApril2025.WhyGenerics;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];

        // If type is not specified, by default an ArrayList of objects is created.
        // In Java, all the classes directly or indirectly extend the Object class.
        // Basically, Integer, String, Double, Boolean etc. all extend the Object class.
        // Object class is the parent of all classes in Java.
        // Therefore, when no type is mentioned, an ArrayList of type Object is created.
        // Now, a Reference of an Object type can point to an instance of any other non-primitive type
        // such as Integer, Double, String, Boolean etc.
        // Therefore, an ArrayList of type Object can contain instances of type String, Integer, Double etc.
        // without any error at the Compile-time.
        // This can lead to type-safety errors/exceptions during the Runtime as shown below.

        ArrayList arrList = new ArrayList();

        arrList.add("Hello");
        arrList.add(16);
        arrList.add(45.45);

        for(Object o : arrList)
        {
            System.out.println(o);
        }

        String o1 = (String) arrList.get(0);
        System.out.println("o1: " + o1);

        Integer o2 = (Integer) arrList.get(1);
        System.out.println("o2: " + o2);

        Double o3 = (Double) arrList.get(2);
        System.out.println("o3: " + o3);

        // The following line does not throw any error at compile-time but throws an exception at Runtime
        // because an instance of type Integer cannot be cast into an instance of type String
        // String str = (String) arrList.get(1);
        // Exception: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String

        Box box = new Box();
        box.setValue(1);

        int i = (Integer) box.getValue(); // Typecasting from Object to Integer then AutoUnboxing from Integer to int
        System.out.println("i: " + i);

         // String s = (String) box.getValue();
         // Exception: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String

        // In order to get rid of such Type-Safety issues and detect such errors at the Compile-time,
        // Generics were introduced.

        // Generic Types allow you to define a class, interface or method with placeholders (type parameters)
        // for the data types they will work with.

    }
}
