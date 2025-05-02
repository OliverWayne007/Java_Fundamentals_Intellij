package com.InterfacesInJava;

public class Main {

    public static void main(String[] args) {

        NormalCar car = new NormalCar();

        car.start();
        car.stop();
        car.accelerate();
        car.applyBrakes();

        System.out.println();

        Media media = new NormalCar();
        media.start();

        System.out.println();

        NiceCar niceCar = new NiceCar();

        niceCar.startEngine();
        niceCar.startMusic();
        niceCar.accelerate();
        niceCar.applyBrakes();
        niceCar.stopMusic();
        niceCar.stopEngine();

        niceCar.upgradeEngine();

        niceCar.startEngine();
        niceCar.startMusic();
        niceCar.accelerate();
        niceCar.applyBrakes();
        niceCar.stopMusic();
        niceCar.stopEngine();

    }

}
