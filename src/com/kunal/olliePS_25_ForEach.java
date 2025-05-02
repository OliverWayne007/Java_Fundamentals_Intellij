package com.kunal;

import java.util.*;

public class olliePS_25_ForEach {
    public static void main(String[] args)
    {
        System.out.println("Enter the values of the array: ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Accessing the elements of the array using a conventional for loop
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // Accessing the elements of the array using an enhanced for loop/for-each loop
        for(int element : arr)
        {
            System.out.print(element + " ");
        }
        System.out.println();

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        for (String element : str)
        {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(str));
    }
}
