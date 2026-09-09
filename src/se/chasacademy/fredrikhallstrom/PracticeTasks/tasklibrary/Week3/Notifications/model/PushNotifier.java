package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.Notifications.model;

public class PushNotifier implements Notifier {

    @Override
    public void sendNotification() {
        IO.println("Push sänt!!");
    }
}
