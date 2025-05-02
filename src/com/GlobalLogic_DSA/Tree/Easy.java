package com.GlobalLogic_DSA.Tree;

import java.util.*;


// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class SolutionEasy {
    public void levelOrderTraversal(TreeNode root , ArrayList< ArrayList<Integer> > lot)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while( !q.isEmpty() )
        {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            while(size > 0)
            {
                TreeNode node = q.poll();
                if(node == null)
                {
                    level.add(-101);
                }
                else
                {
                    level.add(node.val);
                    q.offer(node.left);
                    q.offer(node.right);
                }
                size -= 1;
            }
            lot.add(level);
        }
    }

    public boolean isSymmetric(TreeNode root) {
        ArrayList< ArrayList<Integer> > lot = new ArrayList<>();
        levelOrderTraversal(root , lot);
        for(ArrayList<Integer> arr : lot)
        {
            int i = 0 , j = arr.size() - 1;
            while(i <= j)
            {
                if(arr.get(i) != arr.get(j))
                {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}

public class Easy {

    public static void main(String[] args) {
        System.out.println("This is the code for Tree Easy");
    }
}
