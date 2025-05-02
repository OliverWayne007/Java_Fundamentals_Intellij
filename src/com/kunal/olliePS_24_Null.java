package com.kunal;

import java.util.*;

// In java, primitive types are stored in stack where as non-primitive types and objects are stored
// in heap memory

class PoopStalker
{
    public void shitAssery()
    {
        System.out.println("Yo !, this is some next level shit assery !!!");
    }
}

public class olliePS_24_Null
{
    public static void main(String[] args)
    {
        // Kindly note that all the below data types are non-primitive types.

        String[] arr = new String[5];
        System.out.println("The value of arr[0] is: " + arr[0]);

        String str = null;
        System.out.println("The value of str is: " + str);

        int[] a = new int[5];
        System.out.println("The value of a[0] is: " + a[0]);

        int[] b = null;
        System.out.println(Arrays.toString(b));

        PoopStalker poop = null;
        System.out.println("The value of poop is: " + poop);
    }
}
