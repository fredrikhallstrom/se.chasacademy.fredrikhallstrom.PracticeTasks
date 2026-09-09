package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.WeatherWarningsWithCollAndSOLID.model;

public class SmsAlertSender implements WeatherAlertSender {

    public void sendAlert(String message) {
        IO.println("SMS: " + message);
    }
}
