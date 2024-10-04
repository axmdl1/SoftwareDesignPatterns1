package payment;

import interfaces.Payment;

public class BankTransferPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Bank transfer payment: " + amount + "$");
    }
}
