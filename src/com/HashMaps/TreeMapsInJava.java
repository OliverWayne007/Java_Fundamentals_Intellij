package com.HashMaps;

import java.util.*;

public class TreeMapsInJava {
    public static void main(String[] args) {
        int[] nums = {6 , 2 , 2 , 3 , 3 , 1 , 1 , 1 , 5 , 5};
        HashMap<Integer , Integer> hmap = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(hmap.containsKey(nums[i]) == false)
            {
                hmap.put(nums[i] , 0);
            }
            int freq = hmap.get(nums[i]);
            hmap.put(nums[i] , freq + 1);
        }
        TreeMap< Integer , ArrayList<Integer> > tmap = new TreeMap<>();
        for(Map.Entry< Integer , Integer > pair : hmap.entrySet() )
        {
            int newKey = pair.getValue();
            int newValue = pair.getKey();
            if(tmap.containsKey(newKey) != true)
            {
                tmap.put(newKey , new ArrayList<Integer>());
            }
            tmap.get(newKey).add(newValue);
        }
        System.out.println(tmap);
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry< Integer , ArrayList<Integer> > pair : tmap.entrySet())
        {
            ArrayList<Integer> temp = pair.getValue();
            Collections.sort(temp , Collections.reverseOrder());
            for(int element : temp)
            {
                for(int i = 0 ; i < pair.getKey() ; i++)
                {
                    ans.add(element);
                }
            }
        }
        System.out.println(tmap);
        System.out.println(ans);
    }
}
