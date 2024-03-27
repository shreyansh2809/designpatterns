package Creational.Factory;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Notifying user through Email.");
    }
}
