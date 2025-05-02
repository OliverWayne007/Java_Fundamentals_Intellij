package com.GlobalLogic_DSA.Matrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Easy_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        System.out.println("Enter the elements of the matrix: ");

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(map.containsKey(mat[i][j]) == false)
                {
                    map.put(mat[i][j] , 0);
                }
                map.put(mat[i][j] , map.get(mat[i][j]) + 1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(Map.Entry<Integer , Integer> pair : map.entrySet())
        {
            int value = pair.getValue();
            int key = pair.getKey();
            if(value == 1)
            {
                ans.add(key);
            }
        }

        System.out.println(ans);

    }

}
