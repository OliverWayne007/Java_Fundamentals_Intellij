package com.RevisionApril2025.Generics;

public class Pair <K ,V>
{
    private K key;
    private V value;

    public Pair(K key , V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getKey()
    {
        return this.key;
    }

    public V getValue()
    {
        return this.value;
    }

}
