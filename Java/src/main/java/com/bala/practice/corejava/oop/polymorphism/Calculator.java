package com.bala.practice.corejava.oop.polymorphism;

public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));        // Calls add(int, int)
        System.out.println("Sum of 1, 2, and 3: " + calc.add(1, 2, 3));  // Calls add(int, int, int)
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));  // Calls add(double, double)
    }
}
