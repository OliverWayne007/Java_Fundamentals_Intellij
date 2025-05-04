package com.RevisionApril2025.Generics;

public class Main
{
    public static void main(String[] args)
    {
        // -------------------------------------------------------------------------------------------------------

        Box <String> box1 = new Box<>();

        box1.setValue("Ashley Mao");

        String name = box1.getValue();

        System.out.println("Name: " + name);

        Box <Integer> box2 = new Box<>();

        box2.setValue(100);

        int val = box2.getValue();

        // String str = (String) box2.getValue();
        // Because of Generic Types, the Compiler is now detecting Type-Safety errors at Compile-Time.

        System.out.println("val: " + val);

        // -----------------------------------------------------------------------------------------------------

        Pair <String , Integer > p = new Pair<>("Ashley Mao" , 20);

        String key = p.getKey();
        int value = p.getValue();

        System.out.println("Key: " + key + " , Value: " + value);

        // -------------------------------------------------------------------------------------------------------

        StringContainer sc = new StringContainer();

        sc.set("Ankit Singh");

        System.out.println("Item: " + sc.get());

        // -------------------------------------------------------------------------------------------------------

        GenericContainer <String> gc = new GenericContainer<>();

        gc.set("Arpit Singh");

        System.out.println("Item: " + gc.get());

        // -------------------------------------------------------------------------------------------------------

        BoundedBox <Integer> bb1 = new BoundedBox<>();

        bb1.setValue(1000);

        System.out.println("Value: " + bb1.getValue());

        // BoundedBox <String> bb2 = new BoundedBox<String>();
        // Error: Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number
    }
}
