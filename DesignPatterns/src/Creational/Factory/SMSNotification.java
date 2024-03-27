package Creational.Factory;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Notifying user through SMS.");
    }
}
