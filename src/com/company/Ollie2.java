package com.company;
// DIFFERENCE BETWEEN PRIMITIVE TYPES AND REFERENCE TYPES !!!
public class Ollie2 {
    public static void main(String[] args)
    {
        // Primitive Type --- int
        int a = 10;
        System.out.println("The value of a is: " + a);
        int b = a;
        System.out.println("The value of b is: " + b);
        a = 20;
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);

        // Reference Type --- String
        String str1 = "Oliver Queen";
        String str2 = str1;
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        str2 = "Bruce Wayne";
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        // NOTE: Strings are immutable
    }
}
