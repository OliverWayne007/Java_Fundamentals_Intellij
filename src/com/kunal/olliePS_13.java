package com.kunal;

import java.util.Scanner;

public class olliePS_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b = sc.nextInt();
        System.out.print("a: " + a + " ");
        System.out.println("b: " + b);
        swap(a , b);
        System.out.print("a: " + a + " ");
        System.out.println("b: " + b);
    }

    static void swap(int a , int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
}
