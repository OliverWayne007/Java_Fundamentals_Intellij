package com.Concurrency;

import java.util.concurrent.Semaphore;

class CriticalSection
{
    public static int counter = 0;
}

public class Semaphores {

    public static void main(String[] args) {

        System.out.println("This is a tutorial on thread concurrency using semaphores in java");
        System.out.println();

        Semaphore sem = new Semaphore(1);

        Runnable runnable1 = () -> {
            System.out.println("thread1 waiting for the semaphore permit....");
            try {
                sem.acquire();
                System.out.println("thread1 acquires the semaphore permit and enters the critical section....");
                for(int i = 1 ; i <= 20 ; i++)
                {
                    CriticalSection.counter += 1;
                    System.out.println("Critical Section.counter incremented by thread1 -> " + "counter: " + CriticalSection.counter);
                    Thread.sleep(1000);
                }
                System.out.println("thread1 releases the acquired semaphore permit.....");
                sem.release(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable runnable2 = () -> {
            System.out.println("thread2 waiting for the semaphore permit....");
            try {
                sem.acquire();
                System.out.println("thread2 acquires the semaphore permit and enters the critical section....");
                for(int i = 1 ; i <= 20 ; i++)
                {
                    CriticalSection.counter -= 1;
                    System.out.println("Critical Section.counter decremented by thread2 -> " + "counter: " + CriticalSection.counter);
                    Thread.sleep(1000);
                }
                System.out.println("thread2 releases the acquired semaphore permit.....");
                sem.release(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread1 = new Thread(runnable1 , "thread1");
        Thread thread2 = new Thread(runnable2 , "thread2");

        thread1.start();
        thread2.start();

    }

}
