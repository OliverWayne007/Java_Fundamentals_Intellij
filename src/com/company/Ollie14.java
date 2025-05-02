package com.company;
// TUTORIAL ON MULTI-THREADING IN JAVA BY IMPLEMENTING THE RUNNABLE INTERFACE !!!
class MythreadRunnable1 implements Runnable
{
    public void run()
    {
        int i = 0;
        while(i<40)
        {
            System.out.println("Iam thread1 !!!");
            i++;
        }
    }
}

class MythreadRunnable2 implements Runnable
{
    public void run()
    {
        int i = 0;
        while(i<40)
        {
            System.out.println("Iam thread2 !!!");
            i++;
        }
    }
}

public class Ollie14
{
    public static void main(String[] args)
    {
        MythreadRunnable1 bullet1 = new MythreadRunnable1();
        MythreadRunnable2 bullet2 = new MythreadRunnable2();
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }

}
