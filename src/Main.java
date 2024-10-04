import interfaces.Payment;
import payment.BankTransferPayment;
import payment.CreditPayment;
import payment.PayPalPayment;

class Main{
    public static void main(String[] args) {
        Payment creditCard = new CreditPayment();
        PaymentProcessor paymentProcessor = new PaymentProcessor(creditCard);
        paymentProcessor.process(123.12);

        Payment paypal = new PayPalPayment();
        PaymentProcessor processor = new PaymentProcessor(paypal);
        processor.process(230.09);

        Payment bankTransfer = new BankTransferPayment();
        PaymentProcessor processor2 = new PaymentProcessor(bankTransfer);
        processor2.process(1200);
    }
}