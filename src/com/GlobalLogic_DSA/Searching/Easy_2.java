package com.GlobalLogic_DSA.Searching;

import java.util.*;

class Solution2 {
    public int findPairs(int[] nums, int k) {
        TreeMap<Integer , Integer> tmap = new TreeMap<>();
        for(int i : nums)
        {
            if(tmap.containsKey(i) == false)
            {
                tmap.put(i , 0);
            }
            int freq = tmap.get(i);
            tmap.put(i , freq + 1);
        }
        Arrays.sort(nums);
        int count = 0;
        for(Map.Entry<Integer , Integer> pair : tmap.entrySet())
        {
            int key = pair.getKey();
            if(tmap.containsKey(key + k))
            {
                if(k == 0 && tmap.get(key) == 1)
                {
                    continue;
                }
                count++;
            }
        }
        return count;
    }
}

public class Easy_2 {
    public static void main(String[] args) {
        System.out.println("This file contains the code for searching Easy-2");
    }
}
