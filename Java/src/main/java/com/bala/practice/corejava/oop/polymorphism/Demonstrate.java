package com.bala.practice.corejava.oop.polymorphism;


import com.bala.practice.corejava.oop.inheritance.CreditCardAccount;
import com.bala.practice.corejava.oop.inheritance.SavingsAccount;

// Demonstrate class to test the account types
public class Demonstrate {
    public static void main(String[] args) {

        // Create a FixedDeposit object
        FixedDeposit fd = new FixedDeposit(10000, 5);
        System.out.println("Regular Fixed Deposit:");
        fd.printDetails();

        System.out.println();

        // Create a SeniorCitizenFixedDeposit object
        SeniorCitizenFixedDeposit seniorFd = new SeniorCitizenFixedDeposit(10000, 5);
        System.out.println("Senior Citizen Fixed Deposit:");
        seniorFd.printDetails();

        System.out.println(); // Print a blank line for separation


    }
}

