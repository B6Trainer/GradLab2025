package com.bala.practice.corejava.oop.polymorphism;

// Base class for Fixed Deposit
public class FixedDeposit {
    private double principal;
    private double interestRate; // Annual interest rate

    public double getInterestRate() {
        return interestRate;
    }

    // Constructor
    public FixedDeposit(double principal, double interestRate) {
        this.principal = principal;
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public double calculateInterest() {

        return (principal * getInterestRate() ) / 100;
    }

    // Method to print FD details
    public void printDetails() {
        System.out.println("Fixed Deposit Value: $" + principal);
        System.out.println("Interest rate used: %" + getInterestRate());
        System.out.println("Interest Generated: $" + calculateInterest());
    }
}
