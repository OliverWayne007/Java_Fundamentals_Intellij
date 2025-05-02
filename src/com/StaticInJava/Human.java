package com.StaticInJava;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;

    // static variable
    static long population = 0;

    Human(int age , String name , int salary, boolean married)
    {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
