package com.RevisionApril2025.Generics;

public class StringContainer implements Container <String>
{
    private String item;

    @Override
    public void set(String item)
    {
        this.item = item;
    }

    @Override
    public String get()
    {
        return this.item;
    }
}
