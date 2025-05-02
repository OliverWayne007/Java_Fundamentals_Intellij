package com.company;
// WHEN THE STATIC VARIABLES AND THE STATIC METHODS ARE NOT IN THE SAME CLASS AS THE main METHOD !!!

class Static_Demo
{
    static int a = 10;   // THIS IS A STATIC VARIABLE

    int b = 20;   // THIS IS A NON-STATIC/INSTANCE VARIABLE

    static void display()   // THIS IS A STATIC-METHOD
    {
        System.out.println("Hi , Iam a static-method !!!");
    }

    void show()   // THIS IS A NON-STATIC METHOD
    {
        System.out.println("Hi , Iam a non-static method !!!");
    }

    static   // THIS IS A STATIC-BLOCK
    {
        System.out.println("Hi , Iam a static-block !!! Iam always the first to be executed whenever there is a " +
                "reference of this Static_Demo class anywhere for the first time !!!");
        System.out.println("Also Iam executed only once at the first reference of the Static_Demo class !!!");
    }

}

public class Ollie5 {

    public static void main(String[] args)
    {
        System.out.println("The value of static-variable a is: " + Static_Demo.a);
        Static_Demo.display();

        // INORDER TO ACCESS ANY STATIC-METHOD OR STATIC-VARIABLE PRESENT IN SOME CLASS FROM ANY OTHER CLASS ,
        // WE DO NOT NEED TO CREATE AN OBJECT OF THE CORRESPONDING CLASS WHICH HAS THESE STATIC-METHODS AND
        // STATIC-VARIABLES AS ITS MEMBERS. WE CAN ACCESS THEM BY JUST SPECIFYING THEIR CORRESPONDING CLASS NAME
        // BEFORE THEM , AS SHOWN ABOVE.

        // IN THE ABOVE CODE , SINCE THERE IS A REFERENCE TO THE Static_Demo CLASS , THE STATIC-BLOCK WILL BE
        // EXECUTED FIRST BEFORE ANY OTHER METHOD OR VARIABLE OF THE Static_Demo CLASS !!!

        Static_Demo obj = new Static_Demo();  // CREATING AN OBJECT obj OF THE Static_Demo CLASS.
        System.out.println("The value of non-static variable b is: " + obj.b);
        obj.show();

        // INORDER TO ANY ACCESS NON-STATIC METHODS AND NON-STATIC/INSTANCE VARIABLES PRESENT IN SOME CLASS FROM ANY
        // OTHER CLASS , WE NEED TO CREATE AN OBJECT OF THE CORRESPONDING CLASS WHICH HAS THESE NON-STATIC METHODS
        // AND VARIABLES AS ITS MEMBERS. USING THESE OBJECTS , WE CAN NOW ACCESS THESE METHODS AND VARIABLES
        // FROM ANY OTHER CLASS , AS SHOWN ABOVE.
    }
}
