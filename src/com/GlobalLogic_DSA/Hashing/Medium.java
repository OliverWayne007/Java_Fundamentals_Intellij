package com.GlobalLogic_DSA.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Medium {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i < str.length() ; i++)
        {
            if(map.containsKey(str.charAt(i)) == false)
            {
                map.put(str.charAt(i) , 0);
            }
            map.put(str.charAt(i) , map.get(str.charAt(i)) + 1);
        }

        int count = 0;

        for(Map.Entry<Character , Integer> pair : map.entrySet())
        {
            if(pair.getValue() % 2 == 1)
            {
                count += 1;
            }
        }

        System.out.println(count - 1);
    }

}
