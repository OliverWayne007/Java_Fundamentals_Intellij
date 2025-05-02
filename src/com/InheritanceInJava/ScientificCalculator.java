package com.InheritanceInJava;

// This is an example to multilevel inheritance
public class ScientificCalculator extends AdvancedCalculator{

    public static int power(int base , int exponent)
    {
        int result = 1;

        for(int i = 1 ; i <= exponent ; i++)
        {
            result *= base;
        }

        return result;
    }

    public static double squareRoot(double num)
    {
        return Math.sqrt(num);
    }

}
