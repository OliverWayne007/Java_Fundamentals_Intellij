package com.GlobalLogic_DSA.Array;

import java.util.Scanner;

public class Easy_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");

        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        int ans = 0;

        for(int i = 0 ; i < n ; i++)
        {
            ans = ans^arr[i];
        }

        System.out.println(ans);

        System.out.println();
    }
}
