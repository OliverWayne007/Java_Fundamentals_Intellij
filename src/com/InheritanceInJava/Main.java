package com.InheritanceInJava;

public class Main {

    public static void main(String[] args) {

        // Arithmetic operations using the Basic Calculator
        int sumBasic = BasicCalculator.add(10 , 20);
        int differenceBasic = BasicCalculator.subtract(50 , 20);

        System.out.println("sumBasic: " + sumBasic);
        System.out.println("differenceBasic: " + differenceBasic);

        // Arithmetic operations using the Advanced Calculator
        int sumAdvanced = AdvancedCalculator.add(100 , 200);
        int differenceAdvanced = AdvancedCalculator.subtract(500 , 300);
        int productAdvanced = AdvancedCalculator.multiply(100 , 100);
        double quotientAdvanced = AdvancedCalculator.divide(200 , 100);

        System.out.println("sumAdvanced: " + sumAdvanced);
        System.out.println("differenceAdvanced: " + differenceAdvanced);
        System.out.println("productAdvanced: " + productAdvanced);
        System.out.println("quotientAdvanced: " + quotientAdvanced);

        // Arithmetic operations using the Scientific Calculator
        int sumScientific = ScientificCalculator.add(2000 , 3000);
        int differenceScientific = ScientificCalculator.subtract(2000 , 3000);
        int productScientific = ScientificCalculator.multiply(2000 , 3000);
        double quotientScientific = ScientificCalculator.divide(3000 , 2000);
        int powerScientific = ScientificCalculator.power(20 , 3);
        double sqrtScientific = ScientificCalculator.squareRoot(1000);

        System.out.println("sumScientific: " + sumScientific);
        System.out.println("differenceScientific: " + differenceScientific);
        System.out.println("productScientific: " + productScientific);
        System.out.println("quotientScientific: " + quotientScientific);
        System.out.println("powerScientific: " + powerScientific);
        System.out.println("sqrtScientific: " + sqrtScientific);

    }
}
