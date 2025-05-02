package com.kunal;

import java.util.Scanner;

class Bullshit
{
    public static void info()
    {
        System.out.println("Well this class is bullshit and it's all the info that you're gonna need !!!");
    }
}

public class olliePS_17 {
    public static void main(String[] args)
    {
        // Input and Output in java
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.println("The value of a is: " + a);

        // A little bit about static keyword
        Bullshit.info();
        olliePS_17 obj = new olliePS_17();
        obj.non_static_function();

        // Primitive Data types in java
        int rollno = 20115016;
        System.out.println("Roll Number = " + rollno);
        float marks = 98.548f;
        System.out.println("Marks = " + marks);
        char letter = 'r';
        System.out.println("Character ch = " + letter);
        long largeInteger = 12345678999887L;
        System.out.println("The value of the largeInteger is: " + largeInteger);
        double largeDecimalNumber = 12345.678909;
        System.out.println("The value of the largeDecimalNumber is: " + largeDecimalNumber);
        boolean check = true , uncheck = false;
        System.out.println("Check = " + check + " and " + "UnCheck = " + uncheck);
    }

    public void non_static_function()
    {
        System.out.println("I am a non-static function !!!");
    }
}
