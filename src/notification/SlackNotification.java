package notification;

import interfaces.Notification;

public class SlackNotification implements Notification {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Slack notification for: " + recipient + " message: " + message);
    }
}
