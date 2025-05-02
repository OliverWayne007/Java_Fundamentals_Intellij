package com.GlobalLogic.Stack;

import java.util.Stack;

class SolutionComplex {
    public static int isStackPermutation(int n, int[] ip, int[] op) {
        // code here
        Stack<Integer> st = new Stack<>();

        int i = 0 , j = 0;

        st.push(ip[j]);

        while(j < n && i < n)
        {
            if(st.peek() == op[i])
            {
                st.pop();
                i++;
                if(st.isEmpty() == true)
                {
                    j++;
                    if(j < n)
                    {
                        st.push(ip[j]);
                    }
                }
            }
            else
            {
                j++;
                if(j < n)
                {
                    st.push(ip[j]);
                }
            }
        }
        if(st.isEmpty() == true)
        {
            return 1;
        }
        return 0;
    }
}

public class Complex {
    public static void main(String[] args) {
        System.out.println("This file contains the code for Stack Complex");
    }
}
