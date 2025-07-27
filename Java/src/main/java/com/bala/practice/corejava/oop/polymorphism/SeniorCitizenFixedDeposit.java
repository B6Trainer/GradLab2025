package com.bala.practice.corejava.oop.polymorphism;

public class SeniorCitizenFixedDeposit extends FixedDeposit{

    // Constructor
    public SeniorCitizenFixedDeposit(double principal, double interestRate) {
        super(principal,  interestRate); // Default interest rate for normal FD is 5%
    }

    public double getInterestRate() {
        return super.getInterestRate()+1.0;
    }

}
