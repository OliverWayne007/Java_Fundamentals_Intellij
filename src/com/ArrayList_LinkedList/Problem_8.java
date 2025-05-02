package com.ArrayList_LinkedList;

//Find the sum of elements in each column of a matrix
//Given a matrix, the task is to find the sum of elements in each column

import java.util.Scanner;

public class Problem_8 {

    public static void findSumOfEachCol(int[][] matrix)
    {
        for(int col = 0 ; col < matrix[0].length ; col++)
        {
            int sum = 0;

            for(int row = 0 ; row < matrix.length ; row++)
            {
                sum += matrix[row][col];
            }

            System.out.println(sum);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the num of rows: ");
        int numOfRows = input.nextInt();

        System.out.print("Enter the num of columns: ");
        int numOfCols = input.nextInt();

        int[][] matrix = new int[numOfRows][numOfCols];

        for(int row = 0 ; row < numOfRows ; row++)
        {
            for(int col = 0 ; col < numOfCols ; col++)
            {
                matrix[row][col] = input.nextInt();
            }
        }

        findSumOfEachCol(matrix);

    }
}
