package com.GlobalLogic.LinkedList;

public class Easy_2 {

    public static void traversal(Node head)
    {
        Node start = head;

        while(start != null)
        {
            System.out.print(start.data + " -> ");
            start = start.next;
        }

        System.out.println();
    }

    public static Node reverseList(Node head)
    {
        Node start = head;
        Node prev = null;
        Node after = head;

        while(start != null)
        {
            after = start.next;
            start.next = prev;
            prev = start;
            start = after;
        }

        return prev;
    }

    public static void main(String[] args) {

        System.out.println("This file contains the code for LinkedList Easy-2");

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Creating chain
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        traversal(head);

        head = reverseList(head);

        traversal(head);

    }

}
