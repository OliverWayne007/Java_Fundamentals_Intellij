package com.kunal;

import java.util.Arrays;

public class olliePS_15 {
    public static void main(String[] args) {

        System.out.println();

        int[] arr1 = {1 , 2 , 3 , 4 , 5};

        // System.out.println(arr1);    // Prints ClassName + @ + Hexadecimal representation of the object's Hashcode
        // System.out.println(Arrays.hashCode(arr1)); // Prints the object's Hashcode, which is a numerical representation of
        // the object.

        String str1 = Arrays.toString(arr1);
        System.out.println("str1: " + str1);

        System.out.println();

        String[] arr2 = new String[5];

        // System.out.println(arr2);   // Prints ClassName + @ + Hexadecimal representation of the object's Hashcode
        // System.out.println(Arrays.hashCode(arr2)); // Prints the object's Hashcode, which is a numerical representation of the object.

        System.out.println(arr2[0]);   // Stores null if not explicitly initialized.

        System.out.println();

        System.out.println(Arrays.toString(arr2));

        System.out.println();

        // NOTE: null can only be assigned to non-primitives or reference-types but not primitive types.

        int[] arr3 = null;  // This is possible because arrays are reference types not primitive types.
        System.out.println(arr3);

        System.out.println();

        // int a = null;  // This is not possible because int is a primitive type.

        // NOTE: null is a special value or a literal ( not an object ) that any reference-type points to by default
        // unless specified or initialized otherwise.

        int[] arr4 = new int[5];

        System.out.println(Arrays.toString(arr4));

    }
}
