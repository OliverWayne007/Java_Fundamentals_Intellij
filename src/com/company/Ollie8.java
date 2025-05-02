package com.company;
// WORKING OF NON-USER DEFINED/AUTOMATICALLY INVOKED DEFAULT CONSTRUCTORS !!!
public class Ollie8 {

    // INSTANCE VARIABLES
    String Student_name = "Oliver";      // ALREADY INITIALIZED BY THE USER
    String Father_name;                  // NOT INITIALIZED BY THE USER
    int roll = 16;                       // ALREADY INITIALIZED BY THE USER
    int Grade;                           // NOT INITIALIZED BY THE USER
    String emailid;                      // NOT INITIALIZED BY THE USER

    public static void main(String[] args)
    {
        // CREATING AN OBJECT obj OF THE Ollie8 CLASS TO ACCESS THE INSTANCE VARIABLES OF THE CLASS.
        Ollie8 obj = new Ollie8();
        // HERE Ollie8() IS THE DEFAULT CONSTRUCTOR WHICH IS INVOKED AUTOMATICALLY IF NO DEFAULT CONSTRUCTOR HAS
        // BEEN DEFINED BY THE USER.
        System.out.println("StudentName: " + obj.Student_name);
        System.out.println("FatherName: " + obj.Father_name);
        System.out.println("Rollno: " + obj.roll);
        System.out.println("Grade: " + obj.Grade);
        System.out.println("EmailId: " + obj.emailid);
        // THIS DEFAULT CONSTRUCTOR AUTOMATICALLY INITIALIZES THE CLASS VARIABLES WITH ZERO OR NULL
        // IF THE VALUE HAS NOT BEEN ASSIGNED BY THE USER , AS SHOWN ABOVE.

    }
}
