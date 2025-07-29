package com.bala.practice.cleancode.LSP;

class BirdClass {
    public void fly() {
        System.out.println("Flying...");
    }
}

class OstrichBad extends BirdClass {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly!");
    }
}

