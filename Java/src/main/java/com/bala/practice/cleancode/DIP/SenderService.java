package com.bala.practice.cleancode.DIP;

public class SenderService {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        NotificationService emailService = new NotificationService(emailSender);
        emailService.notifyUser("Welcome via Email!");

        MessageSender smsSender = new SmsSender();
        NotificationService smsService = new NotificationService(smsSender);
        smsService.notifyUser("Welcome via SMS!");
    }
}
