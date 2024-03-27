package Creational.Factory;

public class PostNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Notifying user through Post.");
    }
}
