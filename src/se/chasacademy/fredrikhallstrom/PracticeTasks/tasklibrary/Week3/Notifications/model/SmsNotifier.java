package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.Notifications.model;

public class SmsNotifier implements Notifier {

    @Override
    public void sendNotification() {
        IO.println("SMS Sänt!!");
    }
}
