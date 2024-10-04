package payment;

import interfaces.Payment;
import org.w3c.dom.ls.LSOutput;

public class CreditPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit payment: " + amount + "$");
    }
}
