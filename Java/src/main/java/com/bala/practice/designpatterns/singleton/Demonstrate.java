package com.bala.practice.designpatterns.singleton;

import com.bala.practice.designpatterns.factory.AccountFactory;
import com.bala.practice.designpatterns.factory.BankAccount;

public class Demonstrate {


    public static void main(String[] args) {


        demonstrateSingleton();
        factoryPattern();
    }

    private static void factoryPattern() {
        AccountFactory accountFactory = new AccountFactory();

        // Get an object of SavingsAccount and call its accountType method
        BankAccount account1 = accountFactory.getAccount("SAVINGS");
        account1.accountType();

        // Get an object of CheckingAccount and call its accountType method
        BankAccount account2 = accountFactory.getAccount("CHECKING");
        account2.accountType();

        // Get an object of BusinessAccount and call its accountType method
        BankAccount account3 = accountFactory.getAccount("BUSINESS");
        account3.accountType();
    }

    private static void demonstrateSingleton() {
        // Get the single instance of Singleton
        Singleton singleton = Singleton.getInstance();

        // Call a method on the singleton instance
        singleton.showMessage();
    }


}
