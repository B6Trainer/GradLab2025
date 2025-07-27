package com.bala.practice.corejava.oop.inheritance;

// Subclass for credit card account with swipe and pay methods
public class CreditCardAccount extends Account {
    private double creditLimit;
    private double creditBalance;

    // Constructor
    public CreditCardAccount(String accountNumber, String holderName, double creditLimit) {
        super(accountNumber, holderName);
        this.creditLimit = creditLimit;
        this.creditBalance = 0; // Initially no credit balance
    }

    // Method to swipe credit card
    public void swipe(double amount) {
        if (amount > 0 && (creditBalance + amount) <= creditLimit) {
            creditBalance += amount;
            System.out.println("Swiped: " + amount);
        } else {
            System.out.println("Swipe amount exceeds credit limit.");
        }
    }

    // Method to pay credit balance
    public void pay(double amount) {
        if (amount > 0 && amount <= creditBalance) {
            creditBalance -= amount;
            System.out.println("Paid: " + amount);
        } else {
            System.out.println("Invalid payment amount or amount exceeds balance.");
        }
    }

    // Method to display credit balance
    public void displayInfo() {
        displayAccountInfo();
        System.out.println("Credit Balance: " + creditBalance);
    }
}

