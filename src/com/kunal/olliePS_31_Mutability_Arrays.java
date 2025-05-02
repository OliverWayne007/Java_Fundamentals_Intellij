package com.kunal;

import java.util.Arrays;
import java.util.Scanner;

public class olliePS_31_Mutability_Arrays {
    public static void main(String[] args)
    {
        System.out.println("This tutorial is about mutability in arrays");

        Scanner input = new Scanner(System.in);

        int[] arr1 = {1 , 2 , 3 , 4};
        int[] arr2 = arr1;

        System.out.println("arr1 -> " + Arrays.toString(arr1));
        System.out.println("arr1.hashcode(): " + arr1.hashCode());

        System.out.println("arr2 -> " + Arrays.toString(arr2));
        System.out.println("arr2.hashcode(): " + arr2.hashCode());

        arr2[0] = 10;

        System.out.println("arr1 -> " + Arrays.toString(arr1));
        System.out.println("arr1.hashcode(): " + arr1.hashCode());
        System.out.println("arr2 -> " + Arrays.toString(arr2));
        System.out.println("arr2.hashcode(): " + arr2.hashCode());
    }
}
