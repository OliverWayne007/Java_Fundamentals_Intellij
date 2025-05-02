package com.company;

import java.util.*;

public class Ollie15 {

    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("The factorial of n is: " + Factorial(n));
        System.out.print("This was my code to calculate the factorial of a number in java !!!");
    }

    public static int Factorial(int n)
    {
        int ans = 1;
        if(n == 0 || n == 1)
        {
            return ans;
        }
        for(int i = 2 ; i <= n ; i++)
        {
            ans *= i;
        }
        return ans;
    }
}
