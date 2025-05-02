package com.kunal;

import java.util.Scanner;

public class olliePS_05 {
    public static void main(String[] args) {

        // Find the largest of the three numbers

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();

//        int ans = a;
//        if(ans < b)
//        {
//            ans = b;
//        }
//        if(ans < c)
//        {
//            ans = c;
//        }

        int ans = Math.max(a , b);
        ans = Math.max(ans , c);

        System.out.println("The largest of the three numbers is: " + ans);

    }
}
