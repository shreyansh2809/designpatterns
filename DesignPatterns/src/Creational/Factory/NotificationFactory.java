package Creational.Factory;

public class NotificationFactory {

    public NotificationFactory() {
    }

    Notification createNotification(String type) {
        switch (type) {
            case "SMS" : return new SMSNotification();
            case "email": return new EmailNotification();
            case "push": return new PushNotification();
            default:
                return new PostNotification();
        }
    }
}
