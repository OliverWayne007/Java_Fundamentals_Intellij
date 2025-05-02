package com.kunal;

import java.util.Scanner;

public class olliePS_08 {
    public static void main(String[] args) {
        // Printing the nth Fibonacci number using loops
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci series: ");
        int prev = 1 , ptp = 0 , curr = 0;
        for(int i = 0 ; i <= n ; i++)
        {
            if(i == 0 || i == 1)
            {
                curr = i;
            }
            else
            {
                curr = prev + ptp;
                ptp = prev;
                prev = curr;
            }
            System.out.print(curr + " ");
        }
        System.out.println();
        System.out.println("The value of the nth fibonacci number is: " + curr);
    }
}

