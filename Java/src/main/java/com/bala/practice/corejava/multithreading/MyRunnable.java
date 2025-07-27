package com.bala.practice.corejava.multithreading;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        int counter =5;
        do{
            System.out.println("My Runnable Thread is running. "+counter);
            counter--;
        }while(counter>0);
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        Thread thread2 = new Thread(myRunnable);
        thread2.start();

    }
}

