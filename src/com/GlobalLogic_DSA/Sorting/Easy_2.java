package com.GlobalLogic_DSA.Sorting;

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int num = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(nums[i] == num)
            {
                num += 1;
            }
            else
            {
                break;
            }
        }
        return num;
    }
}

public class Easy_2 {
    public static void main(String[] args) {
        System.out.println("This file contains the code for Sorting Easy-2");
    }
}
