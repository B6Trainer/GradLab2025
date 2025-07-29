package com.bala.practice.cleancode.LSP;



class Sparrow implements FlyingBird {
    public void fly() {
        System.out.println("Sparrow flying");
    }
}

class OstrichGood implements Bird {
    // Ostrich doesn't need to fly
}
