package com.GlobalLogic_DSA.Recursion;

public class Easy_1 {

    public static int calculateSum(int[] arr , int n , int index)
    {
        if(index == n)
        {
            return 0;
        }

        return arr[index] + calculateSum(arr , n , index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        int n = arr.length;
        int sum = calculateSum(arr , n , 0);
        System.out.println("Sum: " + sum);
    }

}
