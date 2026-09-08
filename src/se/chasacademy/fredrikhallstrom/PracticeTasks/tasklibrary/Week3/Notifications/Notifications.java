package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.Notifications;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.Notifications.model.EmailNotifier;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.Notifications.model.Notifier;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.Notifications.model.PushNotifier;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.Notifications.model.SmsNotifier;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;

import java.util.ArrayList;
import java.util.List;

public class Notifications implements TaskTemplate {
    public void start() {
        List<Notifier> notifications = new ArrayList<Notifier>();

        notifications.add(new EmailNotifier());
        notifications.add(new SmsNotifier());
        notifications.add(new PushNotifier());

        for (Notifier notifier : notifications) {
            IO.print(notifier + "\n");
        }
    }
}
