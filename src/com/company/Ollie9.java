package com.company;

import java.util.Scanner;

// USAGE OF THIS KEYWORD !!!
public class Ollie9 {

    private int a = 10;     // INSTANCE VARIABLE

    public void setData(int a)
    {
        this.a = a;
    }

    public void display()
    {
        int a = 200;   // LOCAL VARIABLE
        System.out.println("Local Variable a = " + a);
        System.out.println("Instance Variable a = " + this.a);
    }

    public static void main(String[] args)
    {
        System.out.print("Enter val: ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        Ollie9 obj = new Ollie9();
        obj.setData(val);
        obj.display();
    }
}
