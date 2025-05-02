package com.GlobalLogic_DSA.Array;

import java.util.Scanner;

public class Easy_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");

        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");

        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the value of k: ");

        int k = input.nextInt();

        k = k % n;

        for(int i = k ; i < n ; i++)
        {
            System.out.print(arr[i] + " ");
        }

        for(int i = 0 ; i < k ; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }
}
