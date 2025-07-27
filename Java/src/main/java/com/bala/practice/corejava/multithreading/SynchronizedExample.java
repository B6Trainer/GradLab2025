package com.bala.practice.corejava.multithreading;

public class SynchronizedExample {
    private int counter = 0;

    // Synchronized method to increment counter
    private  void increment() {
        synchronized (this) {
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
        }
    }

    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();

        // First thread
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    example.increment();
                    try {
                        Thread.sleep(50); // Sleep for a bit to simulate work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Thread-1");

        // Second thread
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    example.increment();
                    try {
                        Thread.sleep(50); // Sleep for a bit to simulate work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Thread-2");

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + example.counter);
    }
}

