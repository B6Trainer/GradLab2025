package com.bala.practice.cleancode.DIP;

class EmailSenderBad {
    public void sendEmail(String message) {
        System.out.println("Email sent: " + message);
    }
}

class NotificationServiceBad {
    private EmailSenderBad emailSender = new EmailSenderBad();

    public void notifyUser(String message) {
        emailSender.sendEmail(message);
    }
}
