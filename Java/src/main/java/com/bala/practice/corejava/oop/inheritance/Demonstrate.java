package com.bala.practice.corejava.oop.inheritance;


// Demonstrate class to test the account types
public class Demonstrate {
    public static void main(String[] args) {
        // Test SavingsAccount
        SavingsAccount savings = new SavingsAccount("SA12345", "Alice", 1000);

        savings.displayInfo();
        savings.deposit(500);
        savings.withdraw(200);
        savings.displayInfo();

        System.out.println(); // Print a blank line for separation

        // Test CreditCardAccount
        CreditCardAccount creditCard = new CreditCardAccount("CC67890", "Bob", 2000);
        savings.displayInfo();
        creditCard.swipe(1500);
        savings.displayInfo();
        creditCard.pay(500);
        savings.displayInfo();

        System.out.println(); // Print a blank line for separation


    }
}

