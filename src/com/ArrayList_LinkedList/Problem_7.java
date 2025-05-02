package com.ArrayList_LinkedList;

import java.util.*;

class Solution7
{
    public static ArrayList<Integer> findCommonElements(ArrayList<ArrayList<Integer>> mat)
    {
        // Write your code here.
        HashMap<Integer , Integer> map = new HashMap<>();
        HashMap<Integer , Integer> temp = new HashMap<>();

        int n = mat.size();
        int m = mat.get(0).size();


        for(int i = 0 ; i < n ; i++)
        {
            if(temp.size() != 0)
            {
                temp.clear();
            }

            for(int j = 0 ; j < m ; j++)
            {
                temp.put(mat.get(i).get(j) , i + 1);
            }

            for(Map.Entry<Integer , Integer> pair : temp.entrySet())
            {
                int key = pair.getKey();
                int value = pair.getValue();

                if(map.containsKey(pair.getKey()) == true)
                {
                    map.put(key, map.get(key) + value);
                }
                else
                {
                    map.put(key, value);
                }
            }

        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(Map.Entry<Integer , Integer> pair : map.entrySet())
        {
            if( pair.getValue() == (n * (n + 1))/2 )
            {
                ans.add(pair.getKey());
            }
        }

        return ans;
    }
}


public class Problem_7 {
    public static void main(String[] args) {
        System.out.println("This file contains the code for Common elements in all rows of a matrix");
    }
}
