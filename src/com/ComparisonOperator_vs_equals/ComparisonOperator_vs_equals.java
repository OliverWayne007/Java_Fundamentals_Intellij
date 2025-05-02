package com.ComparisonOperator_vs_equals;

import java.util.Arrays;

public class ComparisonOperator_vs_equals {
    public static void main(String[] args) {

        String str1 = "Arpit";
        String str2 = "Arpit";
        String str3 = new String("Arpit");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());

        System.out.println();

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println();

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println();

        int[] arr1 = {1 , 2 , 3};
        int[] arr2 = {1 , 2 , 3};

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());
        System.out.println(Arrays.hashCode(arr1));
        System.out.println(Arrays.hashCode(arr2));
        System.out.println(arr1 == arr2);

        System.out.println();

        String arr1_str = Arrays.toString(arr1);
        String arr2_str = Arrays.toString(arr2);

        System.out.println(arr1_str);
        System.out.println(arr2_str);
        System.out.println(arr1_str == arr2_str);
        System.out.println(arr1_str.equals(arr2_str));

    }
}

