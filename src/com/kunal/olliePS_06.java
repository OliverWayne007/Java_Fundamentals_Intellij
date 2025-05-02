package com.kunal;

import java.util.*;
import java.io.*;
import java.util.stream.*;
import java.lang.*;

public class olliePS_06 {
    static void solve()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        str = str.toLowerCase();
        String cat = "meow";
        int sz = str.length();
        for(int i = 0 ; i < sz ; i++)
        {
            char ch = str.charAt(i);
            if(ch != 'm' && ch != 'e' && ch != 'o' && ch != 'w')
            {
                System.out.println("NO");
                return;
            }
        }
        int idx = 0;
        char prev = cat.charAt(idx);
        if(str.charAt(0) != prev)
        {
            System.out.println("NO");
            return;
        }
        for(int i = 0 ; i < sz ; i++)
        {
            char ch = str.charAt(i);
            if(ch == prev)
            {
                continue;
            }
            else
            {
                idx += 1;
                prev = cat.charAt(idx);
                if(ch == prev)
                {
                    continue;
                }
                else
                {
                    System.out.println("NO");
                    return;
                }
            }
        }
        if(idx < 3)
        {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        return;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();
        while(tc > 0)
        {
            solve();
            tc--;
        }
    }
}
