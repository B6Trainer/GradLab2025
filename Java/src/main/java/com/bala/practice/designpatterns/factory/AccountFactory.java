package com.bala.practice.designpatterns.factory;

public class AccountFactory {
    // Use getAccount method to get an object of type BankAccount
    public BankAccount getAccount(String accountType) {
        if (accountType == null) {
            return null;
        }
        if (accountType.equalsIgnoreCase("SAVINGS")) {
            return new SavingsAccount();
        } else if (accountType.equalsIgnoreCase("CHECKING")) {
            return new CheckingAccount();
        } else if (accountType.equalsIgnoreCase("BUSINESS")) {
            return new BusinessAccount();
        }
        return null;
    }
}

class SavingsAccount implements BankAccount {
    @Override
    public void accountType() {
        System.out.println("This is a Savings Account.");
    }
}

class CheckingAccount implements BankAccount {
    @Override
    public void accountType() {
        System.out.println("This is a Checking Account.");
    }
}

class BusinessAccount implements BankAccount {
    @Override
    public void accountType() {
        System.out.println("This is a Business Account.");
    }
}


