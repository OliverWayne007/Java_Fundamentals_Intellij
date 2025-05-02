package com.kunal;

import java.util.Scanner;

public class olliePS_03_Loops {
    public static void main(String[] args) {
        int idx = 0;
        while(idx < 10)
        {
            System.out.print(idx + 1 + " ");
            idx++;
        }
        System.out.println();
        if(true)
        {
            System.out.println("Hello World !!!");
        }
        else
        {
            System.out.println("Fuck Off !!!");
        }
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int count = input.nextInt();
        for(int i = 1 ; i <= count ; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
