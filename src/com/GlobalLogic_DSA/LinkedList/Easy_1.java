package com.GlobalLogic.LinkedList;

class Node
{
    public int data;

    public Node next;

    Node(int data)
    {
        this.data = data;
    }
}

public class Easy_1 {

    public static void traversal(Node head)
    {
        Node start = head;

        while(start.next != head)
        {
            System.out.print(start.data + " -> ");
            start = start.next;
        }

        System.out.print(start.data + " -> ");
        System.out.println(start.next.data);
    }

    public static Node exchangeFirstAndLastNodes(Node head)
    {
        Node start = head;
        Node prev = null;

        while(start.next != head)
        {
            prev = start;
            start = start.next;
        }

        prev.next = head;
        start.next = head.next;
        head.next = start;
        head = start;

        return head;

    }

    public static void main(String[] args) {

        System.out.println("This file contains the code for LinkedList Easy-1");

        // Creating a LinkedList
        Node head = new Node(5);
        Node second = new Node(1);
        Node third = new Node(2);
        Node fourth = new Node(3);
        Node fifth = new Node(4);

        // Creating the chain
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = head;

        traversal(head);

        head = exchangeFirstAndLastNodes(head);

        traversal(head);

    }

}
