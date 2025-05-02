package com.MultipleThreadsInJava;

class A extends Thread
{
    public void run()
    {
        for(int i = 1 ; i <= 50 ; i++)
        {
            System.out.println("Current thread: " + Thread.currentThread());
            System.out.println("Hello from A");
            System.out.println();
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i = 1 ; i <= 50 ; i++)
        {
            System.out.println("Current thread: " + Thread.currentThread());
            System.out.println("Hello from B");
            System.out.println();
        }
    }
}

public class Demo extends Thread {
    public static void main(String[] args) {

        System.out.println();

        A a = new A();
        B b = new B();

        // Note that the start() method creates a new thread, which is separate from the main thread.
        // This new thread then executes the run() function.

        // The start() function creates a separate call stack for the new thread created.

        a.start(); // new thread Thread-0 is created
        b.start(); // new thread Thread-1 is created

        // Now, there are three separate/independent threads:
        // 1. Main thread
        // 2. Thread-0
        // 3. Thread-1

        // All these 3 threads continue their execution separately/independently without waiting for each
        // other. Their sequence of execution totally depends on the CPU scheduler.

        // The Main thread goes on to execute the following print statements.
        // Thread-0 executes the run() method of class A.
        // Thread-1 executes the run() method of class B.

        System.out.println("This print statement is executed by: " + Thread.currentThread());
        System.out.println(Thread.currentThread() + " does not wait for the two new threads to finish execution.");
        System.out.println();

        // If we try to call the run() method directly without invoking the start() method, no new thread
        // is created and the execution of the run() method happens on the main thread itself as before.
        // In other words, no multi-threading takes place as everything happens on a single main thread
        // synchronously as before.
    }
}
