package com.kunal;

public class olliePS_14_Arrays {
    public static void main(String[] args) {

        // Creating arrays arr1 and arr2
        int[] arr1 = {1 , 2 , 3 , 4 , 5};
        int[] arr2 = {1 , 2 , 3 , 4 , 5};

        // Printing arr1 and arr2
        System.out.println("Printing the elements of arr1: ");
        for(int i = 0 ; i < arr1.length ; i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Printing the elements of arr2: ");
        for(int i = 0 ; i < arr2.length ; i++)
        {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        System.out.println();

        // Changing arr2
        arr2[0] = 10;
        arr2[arr2.length - 1] = 20;

        // Printing arr1 and arr2 again
        System.out.println("Printing the elements of arr1: ");
        for(int i = 0 ; i < arr1.length ; i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Printing the elements of arr2: ");
        for(int i = 0 ; i < arr2.length ; i++)
        {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        System.out.println();

        // Creating a new array arr3 and pointing it to arr1
        int[] arr3 = arr1;

        // Printing arr3
        System.out.println("Printing the elements of arr3: ");
        for(int i = 0 ; i < arr3.length ; i++)
        {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        System.out.println();

        // Changing elements of arr3
        arr3[0] = 50;
        arr3[arr3.length - 1] = 60;

        // Printing the elements of arr1 , arr2 and arr3
        System.out.println("Printing the elements of arr1: ");
        for(int i = 0 ; i < arr1.length ; i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Printing the elements of arr2: ");
        for(int i = 0 ; i < arr2.length ; i++)
        {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println("Printing the elements of arr3: ");
        for(int i = 0 ; i < arr3.length ; i++)
        {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        System.out.println();

        // Creating a new array arr4
        int[] arr4 = {30 , 40 , 70 , 80 , 90 , 100};

        // Printing the elements of the array arr4
        System.out.println("Printing the elements of arr4: ");
        for(int i = 0 ; i < arr4.length ; i++)
        {
            System.out.print(arr4[i] + " ");
        }
        System.out.println();

        System.out.println();

        // Pointing arr1 to arr4
        arr1 = arr4;

        // Printing arr1 , arr2 , arr3 and arr4
        System.out.println("Printing the elements of arr1: ");
        for(int i = 0 ; i < arr1.length ; i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Printing the elements of arr2: ");
        for(int i = 0 ; i < arr2.length ; i++)
        {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println("Printing the elements of arr3: ");
        for(int i = 0 ; i < arr3.length ; i++)
        {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        System.out.println("Printing the elements of arr4: ");
        for(int i = 0 ; i < arr4.length ; i++)
        {
            System.out.print(arr4[i] + " ");
        }
        System.out.println();

        System.out.println();
    }
}
