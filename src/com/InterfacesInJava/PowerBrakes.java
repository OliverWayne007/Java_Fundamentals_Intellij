package com.InterfacesInJava;

public class PowerBrakes implements Brakes {

    @Override
    public void applyBrakes()
    {
        System.out.println("Power Brakes are applied !!!");
    }
}
