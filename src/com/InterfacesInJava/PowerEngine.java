package com.InterfacesInJava;

public class PowerEngine implements Engine {

    @Override
    public void start()
    {
        System.out.println("Power engine started !!!");
    }

    @Override
    public void stop()
    {
        System.out.println("Power engine stopped !!!");
    }

    @Override
    public void accelerate()
    {
        System.out.println("Power engine is accelerating !!!");
    }

}
