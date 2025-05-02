package com.InterfacesInJava;

public class NiceCar {

    private Engine engine;

    private Media mediaPlayer;

    private Brakes brakes;

    NiceCar()
    {
        engine = new PowerEngine();
        mediaPlayer = new CDPlayer();
        brakes = new PowerBrakes();
    }

    public void startEngine()
    {
        engine.start();
    }

    public void stopEngine()
    {
        engine.stop();
    }

    public void accelerate()
    {
        engine.accelerate();
    }

    public void upgradeEngine()
    {
        engine = new ElectricEngine();
    }

    public void startMusic()
    {
        mediaPlayer.start();
    }

    public void stopMusic()
    {
        mediaPlayer.stop();
    }

    public void applyBrakes()
    {
        brakes.applyBrakes();
    }

}
