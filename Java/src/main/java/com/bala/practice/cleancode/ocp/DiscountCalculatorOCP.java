package com.bala.practice.cleancode.ocp;

interface Discount {
    double apply(double amount);
}

class RegularDiscount implements Discount {
    public double apply(double amount) {
        return amount * 0.9;
    }
}

class PremiumDiscount implements Discount {
    public double apply(double amount) {
        return amount * 0.8;
    }
}

class PlatinumDiscount implements Discount {
    public double apply(double amount) {
        return amount * 0.75;
    }
}


class DiscountCalculatorOCP {
    public double calculate(Discount discount, double amount) {
        return discount.apply(amount);
    }
}
