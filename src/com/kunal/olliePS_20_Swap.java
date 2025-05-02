package com.kunal;

import java.util.Scanner;

public class olliePS_20_Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        swap(a , b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static void swap(int a , int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
}
