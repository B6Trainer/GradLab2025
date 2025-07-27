package com.bala.practice.corejava.multithreading;

class MyThread extends Thread {

    @Override
    public void run() {
        int counter =5;
        do{
            System.out.println(Thread.currentThread().getName() +" My Thread is running. "+counter);
            counter--;
        }while(true);

    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        System.out.println(Thread.currentThread().getName() +" Creating thread. ");
        thread.start();
        System.out.println(Thread.currentThread().getName() +" Thread started. ");
    }
}
