package com.InterfacesInJava;

public class NormalCar implements Engine , Brakes , Media {

    @Override
    public void start() {
        System.out.println("I start the engine like a normal car !!!");
    }

    @Override
    public void stop() {
        System.out.println("I stop the engine like a normal car !!!");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal car !!!");
    }

    @Override
    public void applyBrakes() {
        System.out.println("I apply brakes like a normal car !!!");
    }

}
