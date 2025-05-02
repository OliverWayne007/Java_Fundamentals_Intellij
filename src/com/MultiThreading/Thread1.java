package com.MultiThreading;

public class Thread1 extends Thread {

    private String threadName = "";

    Thread1(String threadName)
    {
        this.threadName = threadName;
    }

    @Override
    public void run()
    {
        for(int i = 1 ; i <= 5 ; i++)
        {
            System.out.println(this.threadName + " --> " + Thread.currentThread() + " --> " + i);
        }
    }
}
