package com.GlobalLogic_DSA.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Easy {

    public static void countOccurrences(ArrayList<Integer> arr)
    {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < arr.size() ; i++)
        {
            int num = arr.get(i);
            map.putIfAbsent(num , 0);
            int count = map.get(num);
            map.put(num , count + 1);
        }

        // System.out.println(map);
        for(Map.Entry<Integer , Integer> pair : map.entrySet())
        {
            System.out.println("Key: " + pair.getKey() + " " + "Occurrences: " + pair.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the number of elements in the list: ");
        int n = input.nextInt();
        for(int i = 1 ; i <= n ; i++)
        {
            int x = input.nextInt();
            arr.add(x);
        }
        countOccurrences(arr);
    }
}
