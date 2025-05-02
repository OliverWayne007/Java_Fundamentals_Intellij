package com.kunal;

import java.util.Scanner;

public class olliePS_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();
        // Find the number of occurrence of the digit 7 in the number
        int n = num.length() , count = 0;
        for(int i = 0 ; i < n ; i++)
        {
            char ch = num.charAt(i);
            if(ch == '7')
            {
                count++;
            }
        }
        System.out.println("The number of occurrence of the digit 7 in the given number is: " + count);
    }
}
