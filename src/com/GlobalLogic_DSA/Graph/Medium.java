package com.GlobalLogic_DSA.Graph;

class Solution {

    public int dfs(int row , int col , int n , int m , int[][] grid , boolean[][] visited)
    {
        if(row < 0 || row >= n || col < 0 || col >= m || grid[row][col] == 0 || visited[row][col] == true)
        {
            return 0;
        }
        visited[row][col] = true;
        return 1 + dfs(row + 1 , col , n , m , grid , visited) +
                dfs(row - 1 , col , n , m , grid , visited) + dfs(row , col + 1 , n , m , grid , visited) +
                dfs(row , col - 1 , n , m , grid , visited) + dfs(row - 1 , col - 1 , n , m , grid , visited) +
                dfs(row + 1 , col - 1 , n , m , grid , visited) + dfs(row - 1 , col + 1 , n , m , grid , visited)
                + dfs(row + 1 , col + 1 , n , m , grid , visited);
    }

    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxArea = 0;
        boolean[][] visited = new boolean[n][m];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(grid[i][j] == 0)
                {
                    continue;
                }
                else
                {
                    if(visited[i][j] == true)
                    {
                        continue;
                    }
                    maxArea = Math.max( maxArea , dfs(i , j , n , m , grid , visited) );
                }
            }
        }
        return maxArea;
    }
}

public class Medium {
    public static void main(String[] args) {
        System.out.println("This is the code for Graph Medium");
    }
}
