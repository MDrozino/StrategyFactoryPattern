package org.example;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" - Sistema de pagamentos - ");

        do{
            System.out.println("1 - Pix");
            System.out.println("2 - Cartão de crédito");
            System.out.println("3 - Boleto");
            System.out.println("Escolha uma das opções:");
            choice = scanner.nextInt();

        }while (choice < 1 || choice > 3);

        System.out.println("Informe o valor do pagamento: ");
        double amount = scanner.nextDouble();

        PaymentStrategy paymentStrategy = null;

        switch (choice) {
            case 1:
                paymentStrategy = new PixPayment();
                break;
            case 2:
                paymentStrategy = new CreditCardPayment();
                break;
            case 3:
                paymentStrategy = new BoletoPayment();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.processPayment(amount);

        }

}