package com.GlobalLogic_DSA.Matrix;

import java.util.Scanner;

public class Easy_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter the elements of the matrix: ");

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for(int i = 0 ; i < n ; i++)
        {
            int temp = mat[i][i];
            mat[i][i] = mat[i][n - 1 - i];
            mat[i][n - 1 - i] = temp;
        }

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

}
