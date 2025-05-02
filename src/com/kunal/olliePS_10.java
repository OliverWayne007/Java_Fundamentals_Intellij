package com.kunal;

import java.util.Scanner;

public class olliePS_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Print the reverse of a given number

        // Approach - 1 : Convert the number into a string

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String str = Integer.toString(num);
        int n = str.length();
        System.out.print("The reverse of the given number is: ");
        for(int i = n - 1 ; i >= 0 ; i--)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        // Approach - 2 : Not converting the number into a string

        int ans = 0;
        while(num > 0)
        {
            int rem = num % 10;
            ans *= 10;
            ans += rem;
            num /= 10;
        }
        System.out.println("The reverse of the given number is: " + ans);
    }
}
