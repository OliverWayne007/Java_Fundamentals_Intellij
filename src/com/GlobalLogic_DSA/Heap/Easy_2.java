package com.GlobalLogic_DSA.Heap;

import java.lang.*;

public class Easy_2 {

    public static int height(int N)
    {
        return (int)Math.floor(Math.log(N) / Math.log(2));
    }

    public static void main(String[] args) {

        int n = 8;
        System.out.println(height(n));
    }

}
