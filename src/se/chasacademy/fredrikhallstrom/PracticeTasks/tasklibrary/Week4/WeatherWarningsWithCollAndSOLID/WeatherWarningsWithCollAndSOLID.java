package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.WeatherWarningsWithCollAndSOLID;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.WeatherWarningsWithCollAndSOLID.model.EmailAlertSender;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.WeatherWarningsWithCollAndSOLID.model.RadioAlertSender;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.WeatherWarningsWithCollAndSOLID.model.SmsAlertSender;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.WeatherWarningsWithCollAndSOLID.model.WeatherAlertSender;

import java.util.ArrayList;
import java.util.List;

public class WeatherWarningsWithCollAndSOLID implements TaskTemplate {
    public void start() {
        List<WeatherAlertSender> alerts = new ArrayList<>();

        alerts.add(new SmsAlertSender());
        alerts.add(new EmailAlertSender());
        alerts.add(new RadioAlertSender());

        for (WeatherAlertSender sender : alerts) {
            sender.sendAlert("Kraftigt oväder väntas");
        }

    }
}
