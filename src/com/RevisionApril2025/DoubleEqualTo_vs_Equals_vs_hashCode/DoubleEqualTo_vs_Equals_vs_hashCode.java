package com.RevisionApril2025.DoubleEqualTo_vs_Equals_vs_hashCode;

import java.util.Arrays;

public class DoubleEqualTo_vs_Equals_vs_hashCode
{
    public static void main(String[] args) {

        String str1 = "Arpit";
        String str2 = "Arpit";
        String str3 = new String("Arpit");
        String str4 = new String("Arpit");

        // The hashCode() method in Java returns an integer representation of the object's memory address or
        // a value derived from the object's content.
        // For String objects, the hashCode() is computed based on the content of the string.
        // That's why str1.hashCode(), str2.hashCode(), str3.hashCode() and str4.hashCode() are the same:
        // they all contain the same string "Arpit"

        System.out.println("str1.hashCode(): " + str1.hashCode());
        System.out.println("str2.hashCode(): " + str2.hashCode());
        System.out.println("str3.hashCode(): " + str3.hashCode());
        System.out.println("str4.hashCode(): " + str4.hashCode());

        System.out.println();

        // The == operator compares the references (memory addresses) of objects, not their actual content

        // str1 and str2 are both String literals, therefore owing to the concept String Constant Pool in Java,
        // both str1 and str2, having the same content point to the same object in the String Constant Pool
        // present in the Heap memory.
        // Therefore, str1 == str2 is true.

        // String str3 = new String("Arpit") explicitly creates a new object and therefore str3 points to
        // a different memory address where the newly created object is stored, which is different from the
        // memory address that is pointed to by str1 and str2.

        // The case of str4 is exactly the same as that of str3.

        // Therefore, str1 == str3 is false and str3 == str4 is also false as all three of them point to different
        // memory addresses that contain 3 different objects.

        System.out.println("str1 == str2 : " + (str1 == str2) );
        System.out.println("str1 == str3 : " + (str1 == str3) );
        System.out.println("str3 == str4 : " + (str3 == str4) );

        System.out.println();

        // str1.equals(str2) compares the actual content of str1 and str2 and not their references (memory addresses)
        // Since str1 , str2 , str3 and str4 all have the same content,
        // str1.equals(str2) is true ,
        // str1.equals(str3) is true and
        // str3.equals(str4) is also true.

        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("str1.equals(str3) : " + str1.equals(str3));
        System.out.println("str3.equals(str4) : " + str3.equals(str4));

        System.out.println();

        int[] arr1 = {1 , 2 , 3};
        int[] arr2 = {1 , 2 , 3};

        System.out.println("arr1: " + arr1);
        System.out.println("arr2: " + arr2);

        // In Java, the hashCode() method for arrays behaves differently than for other objects like String.
        // By default, the hashCode() for an array is derived from the memory address of the array,
        // not its content. This is true for all types of arrays, whether they are arrays of primitives
        // or objects.

        // Key Points:

        // Default hashCode() for Arrays:

        // The hashCode() for an array does not depend on the elements within the array.
        // Instead, it uses the memory address of the array object.
        // Therefore, even if two arrays contain identical elements, their hashCode() values will be different
        // unless they are the same object (i.e., reference the same memory location).

        System.out.println("arr1.hashCode(): " + arr1.hashCode());
        System.out.println("arr2.hashCode(): " + arr2.hashCode());

        // The == operator compares the references (memory addresses) of objects, not their actual content.
        // Since arr1 and arr2 are two separate objects and point to different memory addresses,
        // arr1 == arr2 is false

        System.out.println("arr1 == arr2 : " + (arr1 == arr2) );

        System.out.println();

        String arr1_str = Arrays.toString(arr1);
        String arr2_str = Arrays.toString(arr2);

        System.out.println("Arrays.toString(arr1): " + arr1_str);
        System.out.println("Arrays.toString(arr2): " + arr2_str);

        // The Arrays.toString(arr) method takes an array as input and explicitly creates a new
        // StringBuilder object from the contents of the array and returns the newly created String.

        // Therefore, both arr1_str and arr2_str point to different memory addresses containing
        // different String objects.

        // That is why arr1_str == arr2_str is false.
        System.out.println("arr1_str == arr2_str : " + (arr1_str == arr2_str) );

        // But since the contents of both arr1_str and arr2_str is same,
        // arr1_str.equals(arr2_str) is true.

        System.out.println("arr1_str.equals(arr2_str): " + arr1_str.equals(arr2_str));

    }
}
