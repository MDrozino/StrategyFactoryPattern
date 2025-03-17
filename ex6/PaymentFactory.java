package org.example;

public class PaymentFactory {
    public static PaymentStrategy createPaymentStrategy(int type) {

        switch (type) {
            case 1:
                return new PixPayment();

            case 2:
                return new BoletoPayment();

            case 3:
                return new CreditCardPayment();

            default:
                throw new IllegalArgumentException("Tipo inválido!");
        }
    }
}
