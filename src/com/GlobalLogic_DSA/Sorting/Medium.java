package com.GlobalLogic_DSA.Sorting;

import java.util.HashMap;
import java.util.Scanner;

public class Medium {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");;
        int n = sc.nextInt();

        System.out.println();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Enter the elements of array a: ");
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Enter the elements of array b: ");
        for(int i = 0 ; i < n ; i++)
        {
            b[i] = sc.nextInt();
        }
        System.out.println();

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++)
        {
            map.put(a[i] , i);
        }

        int numOfSwaps = 0;

        for(int i = 0 ; i < n ; i++)
        {
            if(b[i] == a[i])
            {
                continue;
            }
            else
            {
                int swapIndex = map.get(b[i]);
                int swapValue = b[swapIndex];
                int temp = b[i];
                b[i] = swapValue;
                b[swapIndex] = temp;
                numOfSwaps += 1;
                i--;
            }
        }

        System.out.println("The minimum number of swaps required is: " + numOfSwaps);

        System.out.println();

    }

}
