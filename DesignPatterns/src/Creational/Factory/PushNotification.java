package Creational.Factory;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Notifying user through push notification.");
    }
}
