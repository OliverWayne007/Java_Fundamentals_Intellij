package com.ArrayList_LinkedList;

import java.util.ArrayList;

class Solution2
{
    public ArrayList< ArrayList<Integer> > ans = new ArrayList<>();

    public void coinChange(int start , int target , int[] den , int n , ArrayList<Integer> arr)
    {
        if(target == 0)
        {
            ans.add(arr);
            return;
        }
        if(target < 0)
        {
            return;
        }
        for(int i = start ; i < n ; i++)
        {
            arr.add(den[i]);
            coinChange(i , target - den[i] , den , n , arr);
            arr.remove(arr.size() - 1);
        }
    }
}

public class Problem_2 {

    public static void main(String[] args) {

        System.out.println("This file contains the code for coin change problem");

        int[] den = {1 , 2 , 3};
        int n = den.length;
        int target = 4;
        ArrayList<Integer> arr = new ArrayList<>();
        Solution2 sol = new Solution2();
        sol.coinChange(0 , target , den , n , arr);
        System.out.println(sol.ans.size());

    }
}
