package com.company;
// TUTORIAL ON MULTI-THREADING IN JAVA BY EXTENDING THE THREAD CLASS !!!
class Mythread1 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;
       while(i<10)
       {
           System.out.println("Mythread1 is running !!!");
           System.out.println("Iam happy !!!");
           i++;
       }
    }
}

class Mythread2 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;
        while(i<10)
        {
            System.out.println("Mythread2 is running !!!");
            System.out.println("Iam sad !!!");
            i++;
        }
    }
}

public class Ollie13 {
    public static void main(String[] args)
    {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();
    }
}
