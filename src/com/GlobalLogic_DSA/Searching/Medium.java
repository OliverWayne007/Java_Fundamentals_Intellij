package com.GlobalLogic_DSA.Searching;

class Solution {
    int[] sumClosest(int[] arr, int k) {
        // code here
        int start = 0 , end = arr.length - 1 , diff = Integer.MAX_VALUE;
        int[] ans = new int[2];
        while(start < end)
        {
            int sum = arr[start] + arr[end];
            if(Math.abs(k - sum) < diff)
            {
                ans[0] = arr[start];
                ans[1] = arr[end];
                diff = Math.abs(k - sum);
                if(sum > k)
                {
                    end -= 1;
                }
                else
                {
                    start += 1;
                }

            }
            else if(Math.abs(k - sum) == diff)
            {
                if(Math.abs(ans[1] - ans[0]) <= Math.abs(arr[start] - arr[end]))
                {
                    ans[0] = arr[start];
                    ans[1] = arr[end];
                }
                if(sum > k)
                {
                    end -= 1;
                }
                else
                {
                    start += 1;
                }
            }
            else
            {
                if(sum > k)
                {
                    end -= 1;
                }
                else
                {
                    start += 1;
                }
            }

        }
        return ans;
    }
}

public class Medium {

    public static void main(String[] args) {
        System.out.println("This file contains the code for Searching Medium");
    }

}
