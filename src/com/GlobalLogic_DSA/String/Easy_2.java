package com.GlobalLogic_DSA.String;

import java.util.ArrayList;
import java.util.Scanner;

public class Easy_2 {

    public static void placeSpaces(String str , int n , int index , ArrayList<String> arr)
    {
        if(index == n - 1)
        {
            arr.add(str);
            return;
        }
        StringBuilder s = new StringBuilder(str);
        s.insert(index + 1 , ' ');
        placeSpaces(s.toString() , s.length() , index + 2 , arr);
        placeSpaces(str , n , index + 1 , arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        int n = str.length();
        ArrayList<String> arr = new ArrayList<>();
        placeSpaces(str , n , 0 , arr);
        for(String s : arr)
        {
            System.out.println(s);
        }
    }

}
