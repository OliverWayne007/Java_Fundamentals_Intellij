package com.kunal;

import java.util.*;

public class olliePS_29_MultiDimensionArray {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][];
        System.out.println("Enter the values of the 2D array: ");
        for(int row = 0 ; row < arr.length ; row++)
        {
//            System.out.print("Enter the number of columns in row " + row + " : ");
//            int n = input.nextInt();
            for(int col = 0 ; col < arr[row].length ; col++)
            {
                arr[row][col] = input.nextInt();
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
