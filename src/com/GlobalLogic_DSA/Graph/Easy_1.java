package com.GlobalLogic_DSA.Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Easy_1 {

    public static  void dfs(int source , ArrayList<Integer>[] adjList , boolean[] visited)
    {
        visited[source] = true;
        for(int neighbour: adjList[source])
        {
            if(visited[neighbour] == false)
            {
                dfs(neighbour , adjList , visited);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vertices: ");
        int v = sc.nextInt();

        System.out.println();

        System.out.println("Enter the number of edges: ");
        int e = sc.nextInt();

        System.out.println();

        ArrayList<Integer>[] adjList = new ArrayList[v];

        // ArrayList< ArrayList<Integer> > edges = new ArrayList<>();

        System.out.println("Enter the edges: ");

        for(int i = 0 ; i < e ; i++)
        {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            // ArrayList<Integer> edge = new ArrayList<>();
            // edge.add(v1);
            // edge.add(v2);
            // edges.add(edge);
            if(adjList[v1] == null)
            {
                adjList[v1] = new ArrayList<>();
            }
            if(adjList[v2] == null)
            {
                adjList[v2] = new ArrayList<>();
            }
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }

        System.out.println();

        boolean[] visited = new boolean[v];

        int numOfForests = 0;

        for(int vertex = 0 ; vertex < v ; vertex++)
        {
            if(visited[vertex] == true)
            {
                continue;
            }
            else
            {
                dfs(vertex , adjList , visited);
                numOfForests += 1;
            }
        }

        System.out.println("The number of trees in the forest is: " + numOfForests);

        System.out.println();
    }

}
