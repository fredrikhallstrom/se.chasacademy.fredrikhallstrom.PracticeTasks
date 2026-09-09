package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.Notifications.model;

public class EmailNotifier implements Notifier {

    @Override
    public void sendNotification() {
        IO.println("Email sänt!!");
    }
}
