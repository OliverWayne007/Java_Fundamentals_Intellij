package com.ArrayList_LinkedList;

class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}

class Solution {
// Function to check whether the list is palindrome.
boolean isPalindrome(Node head) {
    // Your code here
    if(head.next == null)
    {
        return true;
    }
    Node slow = head;
    Node fast = head.next;
    Node mid = null;
    while(fast != null)
    {
        if(fast.next == null)
        {
            mid = slow;
            break;
        }
        else
        {
            slow = slow.next;
            fast = fast.next.next;
        }
    }
    if(mid == null)
    {
        mid = slow;
    }

    Node before = null;
    Node curr = null;
    Node after = null;
    Node revHead = null;

    if(fast == null)
    {
        before = mid;
        curr = mid.next;
        after = mid.next.next;
        while(after != null)
        {
            curr.next = before;
            before = curr;
            curr = after;
            after = after.next;
        }
        curr.next = before;
        before = curr;
        revHead = before;

        Node start = head;
        Node revStart = revHead;

        while(start != mid && revStart != mid)
        {
            if(start.data != revStart.data)
            {
                return false;
            }
            start = start.next;
            revStart = revStart.next;
        }

        return true;
    }
    else
    {
        curr = mid.next;
        before = mid;
        after = mid.next.next;

        Node revListLastNode = mid.next.next;

        while(after != null)
        {
            curr.next = before;
            before = curr;
            curr = after;
            after = after.next;
        }

        curr.next = before;
        before = curr;
        revHead = before;

        Node start = head;
        Node revStart = revHead;

        while(start != mid && revStart != revListLastNode)
        {
            if(start.data != revStart.data)
            {
                return false;
            }
            start = start.next;
            revStart = revStart.next;
        }

        if(start.data == revStart.data)
        {
            return true;
        }

        return false;
    }
}
}

public class Problem_6 {

    public static void main(String[] args) {
        System.out.println("This file contains the code to check if a singly linked list is a palindrome");
    }
}
