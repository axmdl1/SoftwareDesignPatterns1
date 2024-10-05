import interfaces.Notification;
import interfaces.Payment;
import notification.EmailNotification;
import notification.NotificationService;
import notification.PushNotification;
import notification.SMSNotification;
import payment.BankTransferPayment;
import payment.CreditPayment;
import payment.PayPalPayment;
import payment.PaymentProcessor;

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

        System.out.println("  ^ \n  | \n Part 1 \n============================================= \n Part 2 \n | \n |");

        Notification sms = new SMSNotification();
        Notification Email = new EmailNotification();
        Notification push = new PushNotification();
        NotificationService service  = new NotificationService();

        sms.sendNotification("Hello", "Bob Martin");
        Email.sendNotification("Good morning", "Uncle Bob");
        push.sendNotification("F1 tomorrow", "Charles");
        service.sendBulkNotifications();
    }
}