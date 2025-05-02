package com.kunal;

import java.util.Arrays;

public class olliePS_23_Array {
    public static void main(String[] args)
    {
        // First method to create an array
        int[] nums1 = {1 , 2 , 3 , 4 , 5};
        System.out.println("nums1: " + Arrays.toString(nums1));
        int[] nums2 = {10 , 11 , 12 , 13 , 14};
        System.out.println("nums2: " + Arrays.toString(nums2));

        // Another method to create an array
        int[] arr = new int[5];
        System.out.println("arr: " + Arrays.toString(arr));

        // Breaking down the process of creating an array
        int[] nums3;  // Declaration: nums3 is getting defined in the stack and is currently not pointing to any object. Happens during compile time.
        nums3 = new int[5];  // Initialization and Memory Allocation. Actual creation of object in the heap memory happens here. Happens during runtime.
        System.out.println("nums3: " + Arrays.toString(nums3));
    }
}
