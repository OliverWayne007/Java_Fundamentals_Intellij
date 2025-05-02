package com.GlobalLogic_DSA.Recursion;

public class Easy_2 {

    public static int findMax(int[] arr , int n , int index)
    {
        if(index == n)
        {
            return Integer.MIN_VALUE;
        }
        return Math.max(arr[index] , findMax(arr , n , index + 1));
    }

    public static int findMin(int[] arr , int n , int index)
    {
        if(index == n)
        {
            return Integer.MAX_VALUE;
        }

        return Math.min(arr[index] , findMin(arr , n , index + 1));
    }

    public static void main(String[] args) {

        int[] arr = {10 , 1 , 5 , 11 , 7 , 9 , 11};
        int n = arr.length;

        int mx = findMax(arr , n , 0);
        int mn = findMin(arr , n , 0);

        System.out.println("Max: " + mx);
        System.out.println("Min: " + mn);
    }

}
