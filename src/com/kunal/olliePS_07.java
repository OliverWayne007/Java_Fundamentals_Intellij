package com.kunal;


import java.util.Scanner;

public class olliePS_07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // System.out.print("Enter a string: ");
        // String str = in.next().trim();
        // System.out.println(str);

        //char ch = in.next().trim().charAt(0);
        //System.out.println(ch);

        String word = "Hello World !!!";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));  // Index number 4 does not exist. It is out of bound.

    }
}
