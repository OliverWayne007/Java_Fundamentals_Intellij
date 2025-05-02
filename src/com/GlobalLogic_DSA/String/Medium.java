package com.GlobalLogic_DSA.String;

import java.util.Stack;

class Solution {

    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0 ; i < n ; i++)
        {
            if(st.empty() == true)
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(st.peek() == '[' && s.charAt(i) == ']')
                {
                    st.pop();
                }
                else
                {
                    st.push(s.charAt(i));
                }
            }
        }
        if(st.size() == 0)
        {
            return 0;
        }
        else
        {
            if((st.size()/2) % 2 == 0)
            {
                return st.size()/4;
            }
            else
            {
                return st.size()/4 + 1;
            }
        }
    }

}

public class Medium {

    public static void main(String[] args) {
        System.out.println("This is the code for String medium");
    }
}
