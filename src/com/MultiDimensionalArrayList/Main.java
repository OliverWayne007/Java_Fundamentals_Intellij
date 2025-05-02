package com.MultiDimensionalArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList< ArrayList<Integer> > list = new ArrayList< ArrayList<Integer> >(5);

        for(int i = 0 ; i < 5 ; i++)
        {
            list.add(new ArrayList<Integer>(3));
        }

        for(int i = 0 ; i < 5 ; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                int x = in.nextInt();
                list.get(i).add(x);
            }
        }

        System.out.println(list);

    }
}
