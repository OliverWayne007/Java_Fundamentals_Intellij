package com.RevisionApril2025.CollectionFramework.Collections;

import java.util.ArrayList;

// Unlike a regular array, which has a fixed size, an ArrayList can grow and shrink as elements are added or removed.
// This dynamic resizing is achieved by creating a new array when the current array is full and copying the elements
// to the new array.

// Internally, ArrayList is implemented as an array of object references.

// When you create an ArrayList, it has an initial capacity (default is 10).
// Capacity refers to the size of the internal array that can hold elements before needing to resize.
// The Growth Factor of the internal array is 1.5 times the previous Capacity.

public class Array_List
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1 ; i <= 10 ; i++)
        {
            list.add(i);
        }

        System.out.println(list.toString());

        for(int i = 0 ; i < list.size() ; i++)
        {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();


    }
}
