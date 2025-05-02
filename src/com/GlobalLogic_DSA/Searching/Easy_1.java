package com.GlobalLogic_DSA.Searching;

class Solution1 {
    public int search(int[][] matrix , int row , int m , int mid)
    {
        int[] arr = matrix[row];
        int high = m - 1 , low = 0;
        while(low <= high)
        {
            int midId = (high + low)/2;
            if(arr[midId] < mid)
            {
                low = midId + 1;
            }
            else
            {
                high = midId - 1;
            }
        }
        return high + 1;
    }
    public int numOfElementsSmallerThanMid(int[][] matrix , int n , int m , int mid)
    {
        int numOfSmallerElements = 0;
        for(int row = 0 ; row < n ; row++)
        {
            numOfSmallerElements += search(matrix , row , m , mid);
        }
        return numOfSmallerElements;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[n - 1][m - 1];
        while(low <= high)
        {
            int mid = (low + high)/2;
            int count = numOfElementsSmallerThanMid(matrix , n , m , mid);
            if(count < k)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return high;
    }
}

public class Easy_1 {

    public static void main(String[] args) {
        System.out.println("This file contains the code for Searching Easy-1");
    }

}
