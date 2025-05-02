package com.GlobalLogic_DSA.Stack;

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        // char[] ch = new char[s.length()];
        for(char bracket : s.toCharArray())
        {
            if(st.isEmpty())
            {
                st.push(bracket);
            }
            else
            {
                if(st.peek() == '(' && bracket == ')')
                {
                    st.pop();
                }
                else if(st.peek() == '{' && bracket == '}')
                {
                    st.pop();
                }
                else if(st.peek() == '[' && bracket == ']')
                {
                    st.pop();
                }
                else
                {
                    st.push(bracket);
                }
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        return false;
    }
}

public class Easy_1 {
    public static void main(String[] args) {
        System.out.println("This file contains the code for Stack Easy-1");
    }
}
