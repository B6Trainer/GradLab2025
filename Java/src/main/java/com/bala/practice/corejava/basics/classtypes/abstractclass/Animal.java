package com.bala.practice.corejava.basics.classtypes.abstractclass;

// Abstract class
public abstract class Animal {

    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Concrete method
    public void eat() {
        System.out.println("This animal can eat.");
    }

}
