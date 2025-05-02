package com.ImmutableObjectsInJava;

public class ImmutableObjects_Strings {

    public static void main(String[] args) {

        System.out.println("In this tutorial, we will look into immutability of strings");

        // Note that every object has a unique hashcode

        String name = "Ankit";
        System.out.println("name: " + name);
        System.out.println("The hashcode of name is: " + name.hashCode());

        name += " Singh";
        System.out.println("name: " + name);
        System.out.println("The hashcode of name is: " + name.hashCode());

        name = "Arpit Singh";
        System.out.println("name: " + name);
        System.out.println("The hashcode of name is: " + name.hashCode());

        // Initially, the name reference variable contains the value of the memory-address of the original object.
        // It is important to note that everytime the String object pointed by the reference variable name
        // is changed, the hashcode of the name object changes.
        // This means that every time we modify the name object, the original value/object does not get modified,
        // rather a new object is created in the memory with a different hashcode and the name reference variable
        // now contains the value of the memory-address of the new object.

        // This means that the actual object in the memory is not getting modified rather a new object
        // is being created. This proves that the objects of the String class are immutable in Java.

    }
}
