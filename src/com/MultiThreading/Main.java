package com.MultiThreading;

public class Main {

    public static void main(String[] args) {

        // Note that that the main thread is always a user thread.
        System.out.println("The main thread starts execution....");

        //Java offers two types of threads: user threads and daemon threads.
        //User threads are high-priority threads. The JVM will wait for any user thread to complete
        // its task before terminating it.

        //On the other hand, daemon threads are low-priority threads whose only role is to provide
        // services to user threads.
        //Since daemon threads are meant to serve user threads and are only needed while user threads
        // are running, they won’t prevent the JVM from exiting once all user threads have finished
        // their execution.

        // Until stated otherwise, all the threads explicitly created by the users is a user-thread.
        Thread thread1 = new Thread1("thread1");

        Thread thread2 = new Thread1("thread2");
        // Setting thread2 as a Daemon thread
        thread2.setDaemon(true);

        // Note: It is important to note that the Runnable interface is a Functional interface.
        // The Thread class also implements the run() method of the Runnable interface.

        // Using traditional way of implementing the run() method of the Runnable interface

        // Runnable runnable = new Thread2();
        // runnable.run();

        // Using Anonymous inner class to implement run() method of the Runnable interface

//        Runnable runnable = new Runnable()
//        {
//            @Override
//            public void run()
//            {
//                for(int i = 10 ; i <= 20 ; i++)
//                {
//                    System.out.println(Thread.currentThread() + " --> " + i);
//                }
//            }
//        };
//        runnable.run();

        // Using lambda function to implement the run() method of the Runnable interface
        Runnable runnable = () -> {
            for(int i = 10 ; i <= 20 ; i++)
            {
                System.out.println(Thread.currentThread() + " --> " + i);
            }
        };
        // runnable.run();

        Thread thread3 = new Thread(runnable , "thread3");


        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("The main thread exits....");

    }

}
