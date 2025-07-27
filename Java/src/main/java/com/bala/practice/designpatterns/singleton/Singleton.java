package com.bala.practice.designpatterns.singleton;

public class Singleton {
    // Private static variable of the single instance
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        // Optional: initialization code
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("Clone not allowed");
    }

    // Public static method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Example method for demonstration purposes
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}


