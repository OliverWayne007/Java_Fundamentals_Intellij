package com.GlobalLogic_DSA.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Easy_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        Comparator<Integer> comp1 = new Comparator<Integer>(){
            @Override
            public int compare(Integer a , Integer b)
            {
                return (a > b) ? 1 : -1;
            }
        };

        Comparator<Integer> comp2 = (a , b) -> (a > b) ? 1 : -1;

        PriorityQueue<Integer> pq = new PriorityQueue<>(comp2);

        for(int i = 0 ; i < n ; i++)
        {
            pq.offer(arr[i]);
        }

        System.out.println("pq: " + pq);

        System.out.println();

        for(int i = 1 ; i < k ; i++)
        {
            pq.poll();
        }

        System.out.println("pq: " + pq);

        System.out.println();

        System.out.println("The kth smallest element is: " + pq.peek());

        System.out.println();

    }

}
