package notification;

import interfaces.Notification;

public class PushNotification implements Notification {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Notification sent to " + recipient + " message: " + message);
    }
}
