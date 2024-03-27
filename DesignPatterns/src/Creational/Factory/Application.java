package Creational.Factory;

public class Application {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("email");
        notification.notifyUser();
    }
}
