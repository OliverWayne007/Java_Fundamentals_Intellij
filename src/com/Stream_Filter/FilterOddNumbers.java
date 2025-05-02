package com.Stream_Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOddNumbers {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        List<Integer> oddNumList = new ArrayList<>();

        arr.add(10);
        arr.add(12);
        arr.add(23);
        arr.add(17);
        arr.add(19);
        arr.add(11);
        arr.add(26);

        System.out.println("arr: " + arr);

        // Filtering Odd numbers from arr without streams
//        for(int num : arr)
//        {
//            if(num % 2 == 1)
//            {
//                oddNumList.add(num);
//            }
//        }
//
//        System.out.println("oddNumList: " + oddNumList);

        // Filtering odd numbers from arr using streams
        oddNumList = arr.stream().filter( num -> num % 2 == 1 ).collect(Collectors.toList());

        System.out.println("oddNumList: " + oddNumList);

        // If we don't want to store the filtered data rather just want to print it then,
        arr.stream().filter( (n) -> { return n % 2 == 1; } ).forEach( (n) -> {
            System.out.print(n + " ");
        } );

        System.out.println();
    }
}
