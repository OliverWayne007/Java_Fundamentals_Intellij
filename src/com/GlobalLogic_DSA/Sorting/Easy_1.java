package com.GlobalLogic_DSA.Sorting;

import java.util.Arrays;

public class Easy_1 {

    public static void main(String[] args) {

        System.out.println();

        int[][] arr = { {1 , 3} , {5 , 7} , {2 , 4} , {6 , 8} };

        // int[][] arr = {{1, 3}, {7, 9}, {4, 6}, {10, 13}};

        int n = arr.length;

        System.out.println("Original 2D Array arr: " + Arrays.deepToString(arr));

        System.out.println();

        Arrays.sort(arr , (arr1 , arr2) -> Arrays.compare(arr1 , arr2) );

        System.out.println("Sorted 2D Array: " + Arrays.deepToString(arr));

        System.out.println();

        for(int i = 0 ; i < n - 1 ; i++)
        {
            if(arr[i][1] > arr[i + 1][0])
            {
                System.out.println("True");
                return;
            }
        }

        System.out.println("False");

        System.out.println();

    }

}
