package com.kunal;

import java.util.*;

// In java, only pass-by-value is supported.
// Note: In case of primitives a new object which is a copy of the original object is created in the stack memory.
// In case of non-primitives, no new object is created, rather a copy of the reference is created which points
// to the same original object.
// In java, the concept of primitives and non-primitives is very similar to that in javascript.

public class olliePS_27_Swap_in_One_Shot {

    static void printFriends(String[] arr)
    {
        arr[0] = "Arpit";
        for (String element : arr)
        {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static void swapInt(int x , int y)
    {
        int temp = x;
        x = y;
        y = temp;
    }

    static void swapString(String arrow , String darkKnight)
    {
        // Now, arrow also contains the value of memory-address of the string "Oliver Queen"
        // Now, darkKnight also contains the value of the memory-address of the string "Bruce Wayne"

        // Currently, arrow -> "Oliver Queen" and darkKnight -> "Bruce Wayne"
        System.out.println("arrow: " + arrow);
        System.out.println("darkKnight: " + darkKnight);

        String favourite = arrow;
        // Now, favourite also contains the value of the memory-address of the string "Oliver Queen"
        arrow = darkKnight;
        // Now, arrow contains the value of the memory-address of the string "Bruce Wayne"
        darkKnight = favourite;
        // Now, darkKnight contains the value of the memory-address of the string "Oliver Queen".

        // Therefore, now, arrow -> "Bruce Wayne" and darkKnight -> "Oliver Queen"
        System.out.println("arrow: " + arrow);
        System.out.println("darkKnight: " + darkKnight);

        // Important:
        // Note that in the entire swap process, the value of the memory-address stored in s1 and s2
        // remains un-affected. Therefore, after the entire swap process, the value s1 and s2 remain the same.
    }

    static void swapArrays(int[] arr1 , int[] arr2)
    {
        int[] temp = arr1;
        arr1 = arr2;
        arr2 = temp;
    }

    public static void main(String[] args)
    {
        String[] name = new String[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of your friends: ");
        for(int i = 0 ; i < name.length ; i++)
        {
            name[i] = input.next();
        }
        printFriends(name);

        int a = 10 , b = 20;
        System.out.println("a = " + a + " & " + "b = " + b);
        swapInt(a , b);
        System.out.println("a = " + a + " & " + "b = " + b);

        String s1 = "Oliver Queen" , s2 = "Bruce Wayne";
        // Note that s1 contains the value of the memory-address of the string "Oliver Queen"
        // Note that s2 contains the value of the memory-address of the string "Bruce Wayne"
        System.out.println("s1 = " + s1 + " & " + "s2 = " + s2);
        swapString(s1 , s2);
        System.out.println("s1 = " + s1 + " & " + "s2 = " + s2);

        int[] array1 = {1 , 2 , 3 , 4 , 5};
        int[] array2 = {6 , 7 , 8 , 9 , 10};
        System.out.println("array1: " + Arrays.toString(array1) + " & " + "array2: " + Arrays.toString(array2));
        swapArrays(array1 , array2);
        System.out.println("array1: " + Arrays.toString(array1) + " & " + "array2: " + Arrays.toString(array2));
    }

}
