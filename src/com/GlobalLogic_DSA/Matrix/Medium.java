package com.GlobalLogic_DSA.Matrix;

import java.util.*;

class Solution {
    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows][cols];
        for(int col = 0 ; col < cols ; col++)
        {
            if(matrix[0][col] == '1')
            {
                dp[0][col] = 1;
            }
            else
            {
                dp[0][col] = 0;
            }
        }

        for(int row = 0 ; row < rows ; row++)
        {
            if(matrix[row][0] == '1')
            {
                dp[row][0] = 1;
            }
            else
            {
                dp[row][0] = 0;
            }
        }

        int maxSquareLen = 0;

        for(int row = 0 ; row < rows ; row++)
        {
            for(int col = 0 ; col < cols ; col++)
            {
                if(row == 0 || col == 0)
                {
                    maxSquareLen = Math.max(maxSquareLen , dp[row][col]);
                }
                else
                {
                    if(matrix[row][col] == '0')
                    {
                        dp[row][col] = 0;
                        continue;
                    }
                    dp[row][col] = Math.min( dp[row][col - 1] , Math.min(dp[row - 1][col - 1] , dp[row - 1][col]) ) + 1;
                    maxSquareLen = Math.max(maxSquareLen , dp[row][col]);
                }
            }
        }

        return maxSquareLen * maxSquareLen;

    }
}

public class Medium {
    public static void main(String[] args) {
        System.out.println("This file contains the code for Matrix Medium");
    }
}
