package com.GlobalLogic_DSA.Tree;

import java.util.ArrayList;

class Node
{
  int data;
  Node left, right;

  public Node(int d)
  {
      data = d;
      left = right = null;
  }
}

class SolutionMedium
{
    private ArrayList<Integer> traversal = new ArrayList<>();

    public void leftBoundaryTraversal(Node node)
    {
        if(node == null)
        {
            return;
        }

        if(node.left != null)
        {
            traversal.add(node.data);
            leftBoundaryTraversal(node.left);
        }
        else
        {
            if(node.right != null)
            {
                traversal.add(node.data);
                leftBoundaryTraversal(node.right);
            }
        }
        return;
    }

    public void leafNodeTraversal(Node node)
    {

        if(node == null)
        {
            return;
        }

        if(node.left == null && node.right == null)
        {
            traversal.add(node.data);
            return;
        }

        leafNodeTraversal(node.left);

        leafNodeTraversal(node.right);

        return;

    }

    public void rightBoundaryTraversal(Node node)
    {
        if(node == null)
        {
            return;
        }

        if(node.right != null)
        {
            rightBoundaryTraversal(node.right);
            traversal.add(node.data);
        }
        else
        {
            if(node.left != null)
            {
                rightBoundaryTraversal(node.left);
                traversal.add(node.data);
            }
        }
        return;
    }

    public ArrayList<Integer> boundary(Node node)
    {
        if(node == null)
        {
            return null;
        }

        traversal.add(node.data);

        if(node.left == null && node.right == null)
        {
            return traversal;
        }

        leftBoundaryTraversal(node.left);

        leafNodeTraversal(node);

        rightBoundaryTraversal(node.right);

        return traversal;
    }
}


public class Medium {

    public static void main(String[] args) {

        System.out.println("This file contains the code for Boundary Traversal of a Binary Tree");

    }

}
