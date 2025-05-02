package com.kunal;

import java.util.Scanner;

public class olliePS_11_Functions_1 {
    // Functions in Java
    public static void main(String[] args) {
        sum1();
        int sum = sum2();
        System.out.println("Sum: " + sum);
        String message = Greet();
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        int ans = sum3(a , b);
        System.out.println("Sum: " + ans);
    }

    static void sum1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Sum: " + (a + b));
    }

    static int sum2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        int sum = a + b;
        return sum;
    }

    static String Greet()
    {
        String greeting = "Hey , How are you !!!";
        return greeting;
    }

    static int sum3(int a , int b)
    {
        int sum = a + b;
        return sum;
    }
}
