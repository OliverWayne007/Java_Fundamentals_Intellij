package com.RevisionApril2025.Predicates;

import java.util.function.Predicate;

// Predicate is a Functional Interface with only one Abstract method test with a boolean return type.
// It has various other default methods.

public class Predicates
{
    public static void main(String[] args)
    {
        Predicate <Integer> isEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                return (num % 2 == 0);
            }
        };

        System.out.println("isEven.test(10): " + isEven.test(10) );

        Predicate <Integer> isOdd = (Integer num) -> { return (num % 2 != 0); };

        System.out.println("isOdd.test(10): " + isOdd.test(10));
    }
}
