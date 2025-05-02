package com.RevisionApril2025.DoubleEqualTo_vs_Equals;

//In Java, == and the .equals() method both compare objects, but they differ in how they do it. == compares
//the references (memory addresses) of objects, while .equals() compares the content or values of the objects.
//If two objects have the same content, but are stored in different memory locations, == will return false
// while .equals() will return true. For primitive types, == compares the actual values.

public class DoubleEqualTo_vs_Equals
{
    public static void main(String[] args)
    {
        String name = "Arpit";
        String naam = "Arpit";

        // Comparing the hashcodes of name and naam
        System.out.println("name.hashcode(): " + name.hashCode());
        System.out.println("naam.hashcode(): " + naam.hashCode());

        // Comparing the memory-addresses using ==
        System.out.println("name == naam: " + (name == naam));  // true becoz of String Constant Pool

        // Comparing the actual content using .equals()
        System.out.println("name.equals(naam): " + name.equals(naam));   // true becoz actual content is same

        System.out.println();

        Student student1 = new Student("Ashley Mao" , 22);
        Student student2 = new Student("Ashley Mao" , 22);

        // Comparing the hashcodes of student1 and student2
        System.out.println("student1.hashCode(): " + student1.hashCode());
        System.out.println("student2.hashCode(): " + student2.hashCode());

        // Comparing the memory-address using ==
        System.out.println("student1 == student2: " + (student1 == student2));

        // Comparing the actual content using equals()
        System.out.println("student1.equals(student2): " + student1.equals(student2));

    }
}

class Student
{
    public String name;

    public int age;

    public Student(String name , int age)
    {
        this.name = name;
        this.age = age;
    }
}