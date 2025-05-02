package com.kunal;

import java.util.Arrays;

public class olliePS_32_OOP_1 {

    public static void main(String[] args) {

        // Creating an array of students
        Student[] students = new Student[5];

        // It is important to note that any object is only allocated memory once it has been initialized.
        // The new keyword dynamically allocates memory at runtime and returns a reference to it.

        System.out.println("students: " + Arrays.toString(students));
        // Note that currently, the value of students[i] is null. This is because students[i] is a reference
        // variable that contains the memory-address of the actual object which is created in the heap memory.
        // But, right now, the value of students[i] is null because the actual object has not been initialized
        // yet and hence no memory has been allocated to it yet.
        // Inorder to initialize the object we need to use the new keyword.

        // Using for-each loop to print the contents of the students array
        for(Student student: students)
        {
            System.out.print(student + " ");
        }

        System.out.println();

        for(int i = 0 ; i < 5 ; i++)
        {
            // Initializing the objects
            students[i] = new Student();
        }

        System.out.println(Arrays.toString(students));
        // Now that the objects have been initialized, the value of the reference variables i.e students[i]
        // is no longer null. Rather, they contain a pseudo-memory-address of the actual object created in the
        // heap memory.

        // Accessing the properties of the student object
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println("student[" + i + "].name: " + students[i].name);
            System.out.println("student[" + i + "].roll: " + students[i].roll);
            System.out.println("student[" + i + "].marks: " + students[i].marks);
        }
    }
}

// Creating a custom data-type Student
class Student
{
    // Roll number of the student
    int roll;

    // Name of the student
    String name;

    // Marks of the student
    int marks;
}
