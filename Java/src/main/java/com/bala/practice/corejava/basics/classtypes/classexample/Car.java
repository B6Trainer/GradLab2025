package com.bala.practice.corejava.basics.classtypes.classexample;


public class Car {

    // Properties (fields) of the Car class
    private String make;
    private int year;

    // Constructor to initialize with no properties
    public Car() {

    }

    // Constructor to initialize with properties
    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Year of Manufacture: " + year);
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }
}

