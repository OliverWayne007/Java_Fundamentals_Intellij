package com.RevisionApril2025.StringBufferAndStringBuilder;

public class StringBuffer_StringBuilder
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();

        System.out.println("sb: " + sb);

        System.out.println("sb.capacity(): " + sb.capacity());

        sb.append("Tamikka");

        System.out.println("sb: " + sb);

        System.out.println("sb.hashcode(): " + sb.hashCode());

        System.out.println("sb.capacity(): " + sb.capacity());

        sb.setCharAt(0 , 'D');

        System.out.println("sb: " + sb);

        System.out.println("sb.hashcode(): " + sb.hashCode());

        System.out.println("sb.length(): " + sb.length());

        sb.append(" Prasad");

        System.out.println("sb: " + sb);

        String str = sb.toString();

        System.out.println("str: " + str);
    }
}
