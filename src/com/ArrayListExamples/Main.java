package com.ArrayListExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Integer> arrList = new ArrayList<Integer>();

        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(50);
        arrList.add(60);

        arrList.add(3 , 40);

        System.out.println(arrList);

        arrList.set(2 , 100);

        System.out.println(arrList);

        arrList.remove(2);

        System.out.println(arrList);

        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 5 ; i++)
        {
            int x = sc.nextInt();
            list.add(x);
        }

        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        System.out.println("The size of the list is: " + list.size());

        System.out.println(list.contains(10));

        System.out.println();

        List<Integer> list2 = new ArrayList<>();

        list2.add(40);
        list2.add(50);
        list2.add(100);

        list.addAll(list2);

        System.out.println(list);

        System.out.println();

        for(Integer element : list)
        {
            System.out.println(element);
        }

        System.out.println();

        List<Integer> list3 = new ArrayList<>();

        list3.add(1);
        list3.add(2);
        list3.add(3);

        list.removeAll(list3);

        System.out.println(list);

        list.clear();

        System.out.println(list);

    }
}
