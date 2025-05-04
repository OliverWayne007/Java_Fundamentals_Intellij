package com.RevisionApril2025.Generics;

public class BoundedBox <T extends Number>
{
    private T value;

    public T getValue()
    {
        return this.value;
    }

    public void setValue(T value)
    {
        this.value = value;
    }
}
