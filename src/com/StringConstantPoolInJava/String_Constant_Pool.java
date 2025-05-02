package com.StringConstantPoolInJava;

public class String_Constant_Pool {
    public static void main(String[] args) {

        // Note that every object has a unique hashcode

        String a = "Arpit Singh";
        String b = "Arpit Singh";
        String c = "Arpit Singh";

        // Printing the hashcode of a and b
        System.out.println("a: " + a);
        System.out.println("The hashcode of a is: " + a.hashCode());
        System.out.println("b: " + b);
        System.out.println("The hashcode of b is: " + b.hashCode());
        System.out.println("c: " + c);
        System.out.println("The hashcode of c is: " + c.hashCode());

        // Till now, we can see that all 'a' , 'b' and 'c' have the same hashcode. This means that the
        // reference variables a , b and c contain the value of the memory-address of the same object i.e
        // "Arpit Singh" created in the memory.

        // Now, if we change the actual object value pointed-to by the reference variable b to "Ankit Singh",
        // what would happen ? Let's see.

        b = "Ankit Singh";

        // Printing the hashcodes of a and b again
        System.out.println("a: " + a);
        System.out.println("The hashcode of a is: " + a.hashCode());
        System.out.println("b: " + b);
        System.out.println("The hashcode of b is: " + b.hashCode());
        System.out.println("c: " + c);
        System.out.println("The hashcode of c is: " + c.hashCode());

        // Now, we see that the hashcode of 'a' and 'c' remains the same but the hashcode of 'b' changes.
        // Since every object has a unique hashcode, we can see that the reference variable 'b' now contains
        // the memory-address of a new object "Ankit Singh" created in the memory and the original object
        // "Arpit Singh" remains intact and is still pointed-to by the reference variables 'a' and 'c'.

        // All this happens because of immutability of the String objects and the String Constant Pool that
        // Java maintains.

        // The Java string constant pool is an area in heap memory where Java stores literal string values.
        // The heap is an area of memory used for run-time operations. When a new variable is created and
        // given a value, Java checks to see if that exact value exists in the pool.
        // If the exact value exists then Java does not create a new object in the heap memory.
        // This helps in optimizing the memory usage as it prevents the creation of redundant objects in the
        // heap memory.
    }
}
