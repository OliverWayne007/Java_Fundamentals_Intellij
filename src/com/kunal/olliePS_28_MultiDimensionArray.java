package com.kunal;

import java.util.*;

public class olliePS_28_MultiDimensionArray {
    public static void main(String[] args)
    {
        int[][] a = { {1 , 2 , 3} , {4 , 5 , 6} , {7 , 8 , 9} };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the elements of the 2D array: ");
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("The 2D array looks like: ");
        for(int[] array : arr)
        {
            for(int element : array)
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
