package com.RevisionApril2025.Generics;

public class GenericContainer <T> implements Container <T>
{
    private T item;

    @Override
    public void set(T item)
    {
        this.item = item;
    }

    @Override
    public T get()
    {
        return this.item;
    }
}
