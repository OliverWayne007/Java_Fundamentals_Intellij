package com.ArrayList_LinkedList;

import java.util.*;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int val1 = 0 , val2 = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(map.containsKey(target - nums[i]) == true)
            {
                val1 = target - nums[i];
                val2 = nums[i];
                break;
            }
            else
            {
                map.put(nums[i] , 1);
            }
        }

        int[] arr = {-1 , -1};

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == val1 && arr[0] == -1)
            {
                arr[0] = i;
                continue;
            }
            if(nums[i] == val2 && arr[1] == -1)
            {
                arr[1] = i;
            }
        }
        return arr;
    }
}

public class Problem_1 {
    public static void main(String[] args) {
        System.out.println("This file contains the code for Two Sum");
    }
}
