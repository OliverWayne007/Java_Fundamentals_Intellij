package com.kunal;

import java.util.Scanner;

public class olliePS_04 {
    public static void main(String[] args) {
        // Keep taking integer input from the user and printing them until user enters character 'x'
        Scanner input = new Scanner(System.in);
        while(true)
        {
            String num = input.next();
            if(num.charAt(0) == 'x')
            {
                break;
            }
            System.out.println(num + " ");
        }
    }
}
