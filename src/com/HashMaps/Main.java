package com.HashMaps;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer , String> map = new HashMap<>();

         map.put(1 , "Oliver Queen");
         map.put(2 , "Bruce Wayne");
         map.put(3 , "Barry Allen");
         map.put(4 , "Matt Murdock");
         map.put(5 , "Tony Stark");
         map.put(3 , "Arpit Singh");

        System.out.println(map);

        System.out.println();

         map.remove(3);

         for(int i = 1 ; i <= 5 ; i++)
         {
             System.out.println(map.get(i));
         }

        System.out.println();

        System.out.println(map.containsKey(5));  // true
        System.out.println(map.containsKey(6));  // false
        System.out.println(map.containsValue("Oliver Queen"));  // true
        System.out.println(map.containsValue("Barry Allen"));   // false

    }
}
