package com.Deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        System.out.println(dq);

        System.out.println();

        dq.addFirst(20);
        System.out.println(dq);

        System.out.println();

        dq.addFirst(30);
        System.out.println(dq);

        System.out.println();

        dq.addLast(40);
        System.out.println(dq);

        System.out.println();

        dq.addLast(50);
        System.out.println(dq);

        System.out.println();

    }
}
