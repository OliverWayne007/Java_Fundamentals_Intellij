package com.SinglyLinkedList;

class Node
{
    public int data;

    public Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}

public class Main {
    public static void main(String[] args) {

        // Inserting node at the end of a singly linked list

        Node head = new Node(1);

        Node second = new Node(2);
        head.next = second;

        Node third = new Node(3);
        second.next = third;

        // Traversing the linked list
        Node start = head;

        while(start != null)
        {
            System.out.print(start.data + " ");
            start = start.next;
        }

        System.out.println();

        // Inserting nodes at the start of the singly linked list
        Node newHead = new Node(100);
        newHead.next = head;
        head = newHead;

        // Traversing the linked list
        start = head;

        while(start != null)
        {
            System.out.print(start.data + " ");
            start = start.next;
        }

        System.out.println();

        // Inserting a node in between

        // Inserting a new node in the third position

        Node newThirdNode = new Node(50);

        start = head;
        for(int i = 1 ; i < 2 ; i++)
        {
            start = start.next;
        }

        newThirdNode.next = start.next;
        start.next = newThirdNode;

        // Traversing the linked list
        start = head;

        while(start != null)
        {
            System.out.print(start.data + " ");
            start = start.next;
        }

        System.out.println();

    }
}
