package com.GlobalLogic_DSA.Set;

import java.util.HashSet;

public class Easy {

    public static void main(String[] args) {
        int[] arr = {1 , 1 , 2 , 2 , 2 , 3 , 4 , 5 , 5 , 5 , 5};
        HashSet<Integer> st = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++)
        {
            st.add(arr[i]);
        }
        System.out.println(st.size());
    }

}
