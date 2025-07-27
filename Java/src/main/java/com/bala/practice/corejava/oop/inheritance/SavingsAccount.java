package com.bala.practice.corejava.oop.inheritance;

import com.bala.practice.corejava.oop.basicelements.FirstInterface;
import com.bala.practice.corejava.oop.basicelements.SecondInterface;
import com.bala.practice.corejava.oop.firstobject.EmployeeClass;

// Subclass for savings account with deposit and withdraw methods
public class SavingsAccount extends Account {

    private double balance;


    // Constructor
    public SavingsAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName);
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }

    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to display balance
    public void displayInfo() {
        displayAccountInfo();
        System.out.println("Current Balance: " + balance);
    }
}

