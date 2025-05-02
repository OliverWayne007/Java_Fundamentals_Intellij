package com.VolatileKeyword;

class SingleTonClassWithoutSync
{
    private static SingleTonClassWithoutSync onlyObject = null;

    private SingleTonClassWithoutSync()
    {
        System.out.println("Creating an object of the singleton class....");
    }

    public static SingleTonClassWithoutSync getInstance() throws InterruptedException {
        if(onlyObject == null)
        {
            Thread.sleep(1000);
            onlyObject = new SingleTonClassWithoutSync();
        }
        return onlyObject;
    }
}

public class SingletonWithoutSync {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("A singleton class should be instantiated only once.");
        System.out.println("But if we don't synchronize the two objects, two threads of the singleton class get created which violates the whole purpose of the singleton class.");
        System.out.println();

        Runnable runnable1 = () -> {
            SingleTonClassWithoutSync instance = null;
            try {
                instance = SingleTonClassWithoutSync.getInstance();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(instance.hashCode());
        };

        Runnable runnable2 = () -> {
            SingleTonClassWithoutSync instance = null;
            try {
                instance = SingleTonClassWithoutSync.getInstance();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(instance.hashCode());
        };

        Thread thread1 = new Thread(runnable1 , "thread1");
        Thread thread2 = new Thread(runnable2 , "thread2");

        thread1.start();
        thread2.start();

    }

}
