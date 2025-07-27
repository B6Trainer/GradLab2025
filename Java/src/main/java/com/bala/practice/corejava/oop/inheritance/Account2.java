package com.bala.practice.corejava.oop.inheritance;

// Superclass to represent basic account details
public abstract class Account2 {
    // Fields for account details
    private String accountNumber;
    private String holderName;

    // Constructor
    public Account2(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for holder name
    public String getHolderName() {
        return holderName;
    }

    // Setter for holder name
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber +" Holder Name: " + holderName);
    }
}

