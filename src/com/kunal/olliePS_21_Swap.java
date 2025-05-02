package com.kunal;

public class olliePS_21_Swap {
    public static void main(String[] args)
    {
        String name = "Kunal Kushwaha";  // name is pointing to the object "Kunal Kushwaha".
        System.out.println("name: " + name);
        changeName(name);
        System.out.println("name: " + name);
    }

    static void changeName(String naam)
    {
        naam = "Harry Bhai";  // New object "Harry Bhai" is created and assigned to naam.
    }
}
