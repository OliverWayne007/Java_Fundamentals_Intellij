package com.RevisionApril2025.Generics;

public class GenericMethods
{
    public static <T> void printArrays(T[] arr)
    {
        for(T ele : arr)
        {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    // Example of Method-Overloading in Generic methods

    // Non-Generic display method
    public static void display(Integer val)
    {
        System.out.println("In Integer display ---> Value: " + val);
    }

    // Generic display method
    public static <T> void display(T val)
    {
        System.out.println("In Generic display ---> Value: " + val);
    }

    public static void main(String[] args)
    {
        Integer[] int_arr = {1 , 2 , 3 , 4 , 5};

        String[] str_arr = {"My" , "name" , "is" , "Oliver" , "Queen"};

        Double[] doub_arr = {123.123 , 234.234 , 456.678 , 789.098};

        printArrays(int_arr);

        printArrays(str_arr);

        printArrays(doub_arr);

        display(100);

        display("Matt Murdock");
    }
}
