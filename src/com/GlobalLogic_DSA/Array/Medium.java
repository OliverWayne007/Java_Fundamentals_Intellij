package com.GlobalLogic_DSA.Array;

import java.util.Scanner;

public class Medium {
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
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        int mxe = -1;
        for(int x : arr)
        {
            mxe = Math.max(x , mxe);
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if((mxe - arr[i]) % k != 0)
            {
                System.out.println(-1);
                return;
            }
            else
            {
                ans += (mxe - arr[i])/k;
            }
        }
        System.out.println(ans);
        System.out.println();
    }
}
