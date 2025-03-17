package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int type;
        String message;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" - Sistema de notificação - ");

        System.out.println("1:Email");
        System.out.println("2:SMS");
        System.out.println("3:Push");
        System.out.println("Informe o tipo de mensagem: ");
        type = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite a mensagem: ");
        message = scanner.nextLine();

        Notification newNotification = NotificationFactory.createNotification(type);
        newNotification.send(message);





    }
}