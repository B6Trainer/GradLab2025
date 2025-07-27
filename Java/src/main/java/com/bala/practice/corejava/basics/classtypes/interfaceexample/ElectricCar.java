package com.bala.practice.corejava.basics.classtypes.interfaceexample;

// Class implementing ElectricVehicle
public class ElectricCar implements ElectricVehicle {

    @Override
    public void start() {
        System.out.println("Electric Car is starting...");
    }

    @Override
    public void charge() {
        System.out.println("Charging the electric car...");
    }

    // Additional method specific to ElectricCar
    public void displayDetails() {
        System.out.println("This is an electric car.");
    }
}

