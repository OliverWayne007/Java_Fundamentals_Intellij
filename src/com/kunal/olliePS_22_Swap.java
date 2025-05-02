package com.kunal;

import java.util.Arrays;

public class olliePS_22_Swap {
    public static void main(String[] args)
    {
        int[] arr = {1 , 2 , 3 , 4 , 5};  // Object {1,2,3,4,5} is assigned to arr.
        System.out.println(Arrays.toString(arr));
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changeValue(int[] nums)
    {
        nums[0] = 10; // No new object is created, rather the original object assigned to arr is modified.
    }
}
