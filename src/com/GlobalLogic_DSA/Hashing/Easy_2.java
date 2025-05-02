package com.GlobalLogic_DSA.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Easy_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of cols: ");
        int col = sc.nextInt();
        System.out.println("Enter the elements of the matrix: ");
        int[][] mat = new int[row][col];
        for(int i = 0 ; i < row ; i++)
        {
            for(int j = 0 ; j < col ; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        HashMap< Integer , Integer > map = new HashMap<>();
        for(int i = 0 ; i < row ; i++)
        {
            for(int j = 0 ; j < col ; j++)
            {
                map.put(mat[i][j] , i);
            }
        }

        ArrayList< ArrayList<Integer> > ans = new ArrayList<>();

        for(int i = 0 ; i < row ; i++)
        {
            for(int j = 0 ; j < col ; j++)
            {
                if( map.containsKey(target - mat[i][j]) )
                {
                    int counterPart = map.get(target - mat[i][j]);
                    if(counterPart != i && counterPart > i)
                    {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(mat[i][j]);
                        temp.add(target - mat[i][j]);
                        ans.add(temp);
                    }
                }
            }
        }

        System.out.println(ans);
    }

}
