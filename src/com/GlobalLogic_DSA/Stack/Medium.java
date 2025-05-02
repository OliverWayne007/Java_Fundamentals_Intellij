package com.GlobalLogic_DSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Medium {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println();

        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();

        int[] leftSmallest = new int[n];
        int[] rightSmallest = new int[n];

        st.push(0);
        st1.push(0);

        for(int i = 0 ; i < n ; i++)
        {
            if(st.peek() < arr[i])
            {
                leftSmallest[i] = st.peek();
                st.push(arr[i]);
            }
            else
            {
                while(st.isEmpty() == false && st.peek() >= arr[i])
                {
                    st.pop();
                }
                if(st.isEmpty())
                {
                    leftSmallest[i] = arr[i];
                }
                else
                {
                    leftSmallest[i] = st.peek();
                }
                st.push(arr[i]);
            }
        }

        for(int i = n - 1 ; i >= 0 ; i--) {
            if (st1.peek() < arr[i]) {
                rightSmallest[i] = st1.peek();
                st1.push(arr[i]);
            } else {
                while (st1.isEmpty() == false && st1.peek() >= arr[i]) {
                    st1.pop();
                }
                if (st1.isEmpty()) {
                    rightSmallest[i] = arr[i];
                } else {
                    rightSmallest[i] = st1.peek();
                }
                st1.push(arr[i]);
            }
        }

        int mx = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++)
        {
            mx = Math.max(mx , Math.abs(leftSmallest[i] - rightSmallest[i]));
        }

        System.out.println(mx);

    }

}
