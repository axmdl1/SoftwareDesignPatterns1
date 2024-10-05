package notification;

import interfaces.Notification;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending email to " + recipient + " message: " + message);
    }
}
