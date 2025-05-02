package com.MultiThreading;

public class Thread2 implements Runnable{
    @Override
    public void run()
    {
        for(int i = 10 ; i <= 20 ; i++)
        {
            System.out.println(Thread.currentThread() + " --> " + i);
        }
    }
}
