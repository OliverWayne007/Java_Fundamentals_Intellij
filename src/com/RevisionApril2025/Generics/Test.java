package com.RevisionApril2025.Generics;

interface Printable
{
    void print();
}

class MyNumber extends Number implements Printable
{
    private final int value;

    @Override
    public void print()
    {
        System.out.println("Value: " + value);
    }

    public MyNumber(int value)
    {
        this.value = value;
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

class Boxx <T extends Number & Printable>
{
    private T item;

    public Boxx(T item)
    {
        this.item = item;
    }

    public void display()
    {
        item.print();
    }

    public T get()
    {
        return this.item;
    }
}

public class Test
{
    public static void main(String[] args)
    {
        MyNumber myNumber = new MyNumber(5000);

        Boxx<MyNumber> boxx = new Boxx<>(myNumber);

        boxx.display();
    }
}
