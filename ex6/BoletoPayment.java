package org.example;

public class BoletoPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println(("Código do boleto: 4675837 3678028 7283049 0128364"));
        System.out.println(("Pagamento de R$" + amount + " realizado com sucesso."));
    }
}
