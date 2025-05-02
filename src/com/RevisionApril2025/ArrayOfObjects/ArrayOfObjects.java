package com.RevisionApril2025.ArrayOfObjects;

import java.util.Arrays;

public class ArrayOfObjects
{
    public static void main(String[] args)
    {
        Student[] students = new Student[5];

        for(int i = 0 ; i < students.length ; i++)
        {
            students[i] = new Student("Arpit Singh" , 24 , "9390574819" , 16);
        }

        System.out.println(Arrays.toString(students));

        for(Student student : students)
        {
            System.out.println("Name: " + student.name + " , Age: " + student.age + " , Phone: " + student.phone + " , Roll: " + student.roll + " , Hashcode: " + student.hashCode());
        }
    }
}

class Student
{
    public String name;

    public int age;

    public String phone;

    public int roll;

    public Student(String name , int age , String phone , int roll)
    {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.roll = roll;
    }
}
