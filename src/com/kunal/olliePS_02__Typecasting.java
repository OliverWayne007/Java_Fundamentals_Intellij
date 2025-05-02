package com.kunal;

import java.util.Scanner;

public class olliePS_02__Typecasting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //float num = input.nextFloat();
        //int num = input.nextInt();

        //System.out.print("Enter a character: ");
        //int num = input.next().charAt(0);   // This is how we take a character input in java

        //System.out.println("Num: " + num);

        // The range of the byte datatype in java is from -128 to 127 as it is a signed datatype
        //byte b = 127;
        //System.out.println(b);
        //byte a = (byte)128;
        // Here typecasting is necessary because 128 exceeds the limit for byte datatype and is considered an int and so
        // to store it in a byte , we have to explicitly typecast it to a byte datatype.
        //System.out.println(a);

        //byte a = 40 , b = 50 , c = 100;
        //int d = (a * b)/c;
        //System.out.println(d);

        System.out.println(3 * 43.45478);  // Here 3 which is of int datatype is automatically converted to float datatype.
        System.out.println(34 + 'A');  // Here 'A' which is of char datatype is implicitly converted to int datatype.
    }
}
