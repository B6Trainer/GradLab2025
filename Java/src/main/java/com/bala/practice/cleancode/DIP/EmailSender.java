package com.bala.practice.cleancode.DIP;

class EmailSender implements MessageSender {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}