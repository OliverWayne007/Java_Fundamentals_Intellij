package com.company;
// WHEN THE STATIC VARIABLES AND STATIC METHODS ARE IN THE SAME CLASS AS THE main METHOD !!!
public class Ollie4 {

    static int a = 10;  // THIS IS A STATIC VARIABLE NOT AN INSTANCE VARIABLE

    int b = 20;  // THIS IS AN INSTANCE VARIABLE NOT A STATIC VARIABLE

    static void display()  // THIS IS A STATIC METHOD NOT A NORMAL METHOD
    {
        System.out.println("This is a static method !!!");
    }

    void show()  // THIS IS A NORMAL NON-STATIC METHOD NOT A STATIC METHOD
    {
        System.out.println("This is a normal method !!!");
    }

    static  // THIS IS A STATIC BLOCK
    {
        System.out.println("This is a static block !!!");
    }

    void display_static_int()   // THIS IS A NON-STATIC METHOD
    {
        System.out.println("THIS IS A NON-STATIC METHOD THAT ACCESSES A STATIC VARIABLE !!!");
        System.out.println(a);
    }

    void display_non_static_int()   // THIS IS A NON-STATIC METHOD
    {
        System.out.println("THIS IS A NON-STATIC METHOD THAT ACCESSES A NON-STATIC VARIABLE !!!");
        System.out.println(b);
    }

    public static void main(String[] args)  // THE main METHOD IS ALSO A STATIC METHOD !!!
    {
        System.out.println("The value of a is: " + a);
        display();

        // NOTE: STATIC METHODS CAN ONLY ACCESS OTHER STATIC METHODS AND STATIC VARIABLES DIRECTLY i.e
        // WITHOUT CREATING ANY OBJECT OF THE CORRESPONDING CLASS. IN ORDER TO ACCESS THE INSTANCE VARIABLES
        // AND NON-STATIC METHODS FROM A STATIC METHOD , AN OBJECT OF THE CORRESPONDING CLASS HAS TO BE CREATED.

        // System.out.println("The value of b is: " + b);
        // show();

        // IF WE TRY TO ACCESS A NON-STATIC/INSTANCE VARIABLE AND A NON-STATIC METHOD DIRECTLY FROM A STATIC METHOD ,
        // AS SHOWN ABOVE , AN ERROR IS THROWN !!!

        Ollie4 obj = new Ollie4();
        System.out.println("The value of b is: " + obj.b);
        obj.show();

        // INORDER TO ACCESS THE NON-STATIC METHODS AND NON-STATIC VARIABLES/INSTANCE VARIABLES FROM A STATIC METHOD ,
        // WE NEED TO CREATE AN OBJECT OF THE CORRESPONDING CLASS THAT HAS THESE NON-STATIC METHODS AND VARIABLES
        // AS ITS MEMBERS , AS SHOWN ABOVE.

        obj.display_non_static_int();
        obj.display_static_int();

        // FROM THE ABOVE TWO LINES OF CODE IT IS CLEAR THAT WE CAN ACCESS BOTH STATIC AND NON-STATIC VARIABLES AND
        // METHODS FROM A NON-STATIC METHOD.

        // CONCLUSION: WE CAN ACCESS BOTH STATIC AND NON-STATIC VARIABLES AND METHODS FROM A NON-STATIC METHOD BUT ,
        // IF WE TRY TO ACCESS A NON-STATIC/INSTANCE VARIABLE AND A NON-STATIC METHOD DIRECTLY FROM A STATIC METHOD ,
        // AN ERROR IS THROWN !!!
    }
}
