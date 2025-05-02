package com.kunal;

import java.util.Arrays;

public class olliePS_16 {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        System.out.println("arr.length: " + arr.length);
        System.out.println("arr: " + Arrays.toString(arr));
        int[] brr = new int[5];
        for(int i = 0 ; i < brr.length ; i++) {
            brr[i] = i;
        }
        System.out.println("brr.length: " + brr.length);
        System.out.println("brr: " + Arrays.toString(brr));
        System.out.println();
        arr = brr;
        System.out.println("arr.length: " + arr.length);
        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println();
    }
}
