package com.GlobalLogic_DSA.Recursion;

import java.util.ArrayList;

class Solution {

    public static void possiblePath(int row , int col , int[][] grid , int n , int m , ArrayList<Integer> path , ArrayList< ArrayList<Integer> > allPaths)
    {
        if(col >= m || row >= n)
        {
            return;
        }
        if(row == n - 1 && col == m - 1)
        {
            path.add(grid[row][col]);
            ArrayList<Integer> validPath = new ArrayList<>(path);
            allPaths.add(validPath);
            path.remove(path.size() - 1);
            return;
        }
        path.add(grid[row][col]);
        possiblePath(row , col + 1 , grid , n , m , path , allPaths);
        possiblePath(row + 1 , col , grid , n , m , path , allPaths);
        path.remove(path.size() - 1);
        return;
    }

    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n,int m, int[][] grid) {
        // code here
        ArrayList< ArrayList<Integer> > allPaths = new ArrayList<>();

        ArrayList<Integer> path = new ArrayList<>();

        possiblePath(0 , 0 , grid , n , m , path , allPaths);

        return allPaths;
    }
}

public class Medium {
    public static void main(String[] args) {
        System.out.println("This is the code for recursion medium");
    }
}
