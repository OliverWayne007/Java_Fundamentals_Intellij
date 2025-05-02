package com.ArrayList_LinkedList;

import java.util.*;

class Solution3 {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap < String , ArrayList<String> > map = new HashMap<>();

        List< List<String> > ans = new ArrayList<>();
        int n = strs.length;

        for(int i = 0 ; i < n ; i++)
        {
            char[] charr = strs[i].toCharArray();
            Arrays.sort(charr);
            String s = String.valueOf(charr);
            if(map.containsKey(s) == true)
            {
                ArrayList<String> arr = map.get(s);
                arr.add(strs[i]);
            }
            else
            {
                ArrayList<String> arr = new ArrayList<>();
                arr.add(strs[i]);
                map.put(s , arr);
            }
        }

        for(Map.Entry< String , ArrayList<String> > pair : map.entrySet())
        {
            ans.add(pair.getValue());
        }

        return ans;
    }
}

public class Problem_3 {
    public static void main(String[] args) {
        System.out.println("This file contains the code for Grouping Anagrams");
    }
}
