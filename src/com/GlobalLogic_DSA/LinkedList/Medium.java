package com.GlobalLogic.LinkedList;

import java.util.HashSet;
import java.util.Scanner;

class DLLNode
{
    public int data;

    DLLNode prev;

    DLLNode next;

    DLLNode(int data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

}

public class Medium {

    private static HashSet<Integer> set = new HashSet<>();

    public static void traversal(DLLNode head)
    {
        DLLNode start = head;

        while(start != null)
        {
            System.out.print(start.data + " -> ");
            start = start.next;
        }

        System.out.println();
    }

    public static void removeDuplicate(DLLNode head)
    {
        DLLNode curr = head.next;
        DLLNode prev = head;

        set.add(head.data);

        while(curr != null)
        {
            if(set.contains(curr.data))
            {
                prev.next = null;
                curr.prev = null;
                curr = curr.next;
            }
            else
            {
                set.add(curr.data);
                prev.next = curr;
                curr.prev = prev;
                prev = prev.next;
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes: ");
        int n  = sc.nextInt();

        System.out.println("Enter the data value of head node: ");
        int headData = sc.nextInt();

        DLLNode head = new DLLNode(headData);

        DLLNode start = head;

        while(n > 1)
        {
            System.out.println("Enter the data value: ");
            int data = sc.nextInt();

            start.next = new DLLNode(data);
            start.next.prev = start;
            start = start.next;

            n -= 1;

        }

        System.out.println();

        System.out.println("Before removing duplicates: ");

        traversal(head);

        System.out.println();

        removeDuplicate(head);

        System.out.println("After removing duplicates: ");

        traversal(head);

        System.out.println();

    }

}
