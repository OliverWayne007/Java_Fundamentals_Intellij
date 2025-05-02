package com.GlobalLogic_DSA.Hashing;

import java.util.HashMap;
import java.util.Map;

public class Easy_1 {

    public static void main(String[] args) {

        int[] a = {1 , 1 , 1 , 4};
        int[] b = {1 , 6 , 7};

        HashMap<Integer , Integer> hmap1 = new HashMap<>();
        HashMap<Integer , Integer> hmap2 = new HashMap<>();

        for(int i = 0 ; i < a.length ; i++)
        {
            if( hmap1.containsKey(a[i]) == false )
            {
                hmap1.put(a[i] , 0);
            }
            hmap1.put(a[i] , hmap1.get(a[i]) + 1);
        }

        for(int i = 0 ; i < b.length ; i++)
        {
            if( hmap2.containsKey(b[i]) == false )
            {
                hmap2.put(b[i] , 0);
            }
            hmap2.put(b[i] , hmap2.get(b[i]) + 1);
        }

        int count = 0;

        for(Map.Entry<Integer , Integer> pair : hmap1.entrySet())
        {
            if(hmap2.containsKey(pair.getKey()) == true)
            {
                count += Math.min(pair.getValue() , hmap2.get(pair.getKey()));
            }
        }

        System.out.println(count);

    }

}
