package com.kunal;

import java.util.*;

import java.util.Scanner;

public class olliePS_19 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        float num2 = input.nextFloat();
        float sum = num1 + num2;
        System.out.println("Sum = " + sum);

        // Explicit Typecasting
        System.out.print("Enter the value of shit: ");
        int shit = (int) input.nextFloat();
        System.out.println("Shit = " + shit);
    }
}
