package org.example;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("\nEmail enviado! \n" + message);
    }
}
