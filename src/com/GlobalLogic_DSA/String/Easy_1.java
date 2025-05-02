package com.GlobalLogic_DSA.String;

import java.util.Arrays;
import java.util.Scanner;

public class Easy_1 {

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;
        String smallestWord = "" , largestWord = "";
        for(String word : words)
        {
            int len = word.length();
            if(len > maxLength)
            {
                largestWord = word;
                maxLength = len;
            }
            if(len < minLength)
            {
                smallestWord = word;
                minLength = len;
            }
        }
        System.out.println("Smallest Word: " + smallestWord);
        System.out.println("Largest Word: " + largestWord);
    }

}
