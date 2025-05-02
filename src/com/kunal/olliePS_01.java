package com.kunal;

import java.util.Scanner;

public class olliePS_01 {
    public static void main(String[] args)
    {
        System.out.println("The Dark Knight Rises !!!");
        System.out.println("It's good to be back !!!");

        Scanner input = new Scanner(System.in);  // This is how we take input from keyboard in java

        //int a = input.nextInt() , b = input.nextInt() , sum = a + b;
        //System.out.println("The sum of a and b is: " + sum);

        //String name = input.nextLine();
        //System.out.println("My name is: " + name);

        //float c = input.nextFloat() , d = input.nextFloat();
        //System.out.println("The sum of c and d is: " + (c + d));

        //float p = input.nextInt();    // This is implicit typecasting
        // float q = input.nextFloat();
        //System.out.println("The sum of p and q is: " + (p + q));

        int r = (int) input.nextFloat(), s = input.nextInt();   // This is explicit typecasting
        System.out.println("The sum of r and s is: " + (r + s));
    }
}
