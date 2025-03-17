package org.example;

public class PixPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println(("Código pix: 082394938578354367"));
        System.out.println("Pagamento de R$" + amount + " realizado.");
    }
}
