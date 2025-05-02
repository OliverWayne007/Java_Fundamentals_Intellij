package com.Stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st.peek());

        System.out.println();

        System.out.println(st);

        while( !st.empty() )
        {
            System.out.println(st.pop());
        }

        System.out.println();

        System.out.println(st);

        String str = "Arpit";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
    }
}
