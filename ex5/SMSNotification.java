package org.example;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("\nSMS enviado! \n" + message);
    }
}
