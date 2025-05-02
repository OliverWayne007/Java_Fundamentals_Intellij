package com.company;
// WHEN STATIC-BLOCK AND main METHOD ARE NOT IN THE SAME CLASS !!!
public class Ollie6 {

    public static void main(String[] args)
    {
        System.out.println("Hi , Iam executing the main method !!!");
        // NOTE: IN THE ABOVE PROGRAM THERE IS NO REFERENCE OF THE Static_Block CLASS AND SO THE STATIC-BLOCK WILL
        // NOT GET EXECUTED !!!

        System.out.println("The value of static variable a is: " + Static_Block.a);

        //Static_Block sblock;
        // Note that if we just create a reference variable of the Static_Block class and do not instantiate it i.e.
        // do not actually create an object of that class, then the STATIC-BLOCK does not get executed !!!

//        Static_Block s_block = new Static_Block();
        // Note that just as we create an object of the Static_Block class, the STATIC-BLOCK present in the
        // Static_Block class gets executed !!!
    }
}

class Static_Block
{
    static int a = 10;

    static   // THIS IS A STATIC-BLOCK
    {
        System.out.println("Iam a static-block !!!");
    }
}
