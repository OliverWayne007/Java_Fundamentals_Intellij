package com.kunal;

import java.util.Scanner;

public class olliePS_12 {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String message = myGreet(name);
        System.out.println(message);
    }

    static String myGreet(String naam)
    {
        String greeting = "Hello " + naam + " !!!";
        return greeting;
    }
}
