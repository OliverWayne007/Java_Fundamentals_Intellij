package com.GlobalLogic_DSA.Map;

import java.util.HashMap;
import java.util.Map;

public class Medium {

    public static void main(String[] args) {

        HashMap<String , Integer> map = new HashMap<>();

        map.put("abc" , 10);
        map.put("def" , 5);
        map.put("ghi" , 11);
        map.put("jkl" , 8);
        map.put("mno" , 13);
        map.put("pqr" , 3);

        Map.Entry<String , Integer> entry = null;
        int maxValue = Integer.MIN_VALUE;

        for(Map.Entry<String , Integer> pair : map.entrySet())
        {
            if(pair.getValue() > maxValue)
            {
                entry = pair;
            }
        }
        System.out.println("Entry: " + entry);
    }

}
