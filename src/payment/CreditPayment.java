package payment;

import interfaces.Payment;

public class CreditPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit payment: " + amount + "$");
    }
}
