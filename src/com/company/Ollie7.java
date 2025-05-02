package com.company;
// CONSTRUCTORS AND ITS TYPES !!!
public class Ollie7 {

    // INSTANCE VARIABLES
    int rollno;
    String name;

    // USING DEFAULT CONSTRUCTOR FOR INITIALISATION OF CLASS VARIABLES
    Ollie7()
    {
        rollno = 16;
        name = "Oliver";
    }

    // PARAMETERIZED CONSTRUCTOR
    Ollie7(String str , int roll)
    {
        name = str;
        rollno = roll;
    }

    public static void main(String[] args)
    {
        // WORKING OF USER-DEFINED DEFAULT CONSTRUCTOR
        Ollie7 obj1 = new Ollie7();
        System.out.println("Name: " + obj1.name);
        System.out.println("Rollno: " + obj1.rollno);

        // WORKING OF PARAMETERIZED CONSTRUCTOR
        Ollie7 obj2 = new Ollie7("Bruce" , 14);
        System.out.println("Name: " + obj2.name);
        System.out.println("Rollno: " + obj2.rollno);
    }
}
