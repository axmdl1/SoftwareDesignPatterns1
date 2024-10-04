package payment;

import interfaces.Payment;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal payment: " + amount + "$");
    }
}
