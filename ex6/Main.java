package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int type;
        double amount;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" - Sistema de pagamento po factory - ");

        System.out.println("1:Pix");
        System.out.println("2:Boleto");
        System.out.println("3:Cartão de crédito");
        System.out.println("Informe o tipo de pagamento: ");
        type = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o valor do pagamento: ");
        amount = scanner.nextDouble();

        PaymentStrategy newPayment = PaymentFactory.createPaymentStrategy(type);
        newPayment.processPayment(amount);
    }
}