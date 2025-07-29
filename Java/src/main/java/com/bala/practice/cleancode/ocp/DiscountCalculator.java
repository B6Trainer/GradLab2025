package com.bala.practice.cleancode.ocp;

class DiscountCalculator {
    public double calculate(String customerType, double amount) {
        if (customerType.equals("Regular")) return amount * 0.9;
        else if (customerType.equals("Premium")) return amount * 0.8;
        return amount;
    }
}
