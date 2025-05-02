package com.Concurrency;

import java.util.concurrent.Semaphore;

class CriticalSectionWithoutSemaphores
{
    public static int counter = 0;
}

public class WithoutSemaphores {

    public static void main(String[] args) {

        System.out.println("This is a tutorial on the requirement of semaphores for thread concurrency");
        System.out.println();

        // Semaphore sem = new Semaphore(1);

        Runnable runnable1 = () -> {
            System.out.println("thread1 enters the critical section....");
            // sem.acquire();
            // System.out.println("thread1 acquires the semaphore permit and enters the critical section....");
            for(int i = 1 ; i <= 20 ; i++)
            {
                CriticalSectionWithoutSemaphores.counter += 1;
                System.out.println("counter incremented by thread1 -> " + "counter: " + CriticalSectionWithoutSemaphores.counter);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("thread1 exits the critical section.....");
            // sem.release(1);
        };

        Runnable runnable2 = () -> {
            System.out.println("thread2 enters the critical section...");
            // sem.acquire();
            // System.out.println("thread2 acquires the semaphore permit and enters the critical section....");
            for(int i = 1 ; i <= 20 ; i++)
            {
                CriticalSectionWithoutSemaphores.counter -= 1;
                System.out.println("counter decremented by thread2 -> " + "counter: " + CriticalSectionWithoutSemaphores.counter);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("thread2 exits the critical section.....");
            // sem.release(1);
        };

        Thread thread1 = new Thread(runnable1 , "thread1");
        Thread thread2 = new Thread(runnable2 , "thread2");

        thread1.start();
        thread2.start();

    }

}
