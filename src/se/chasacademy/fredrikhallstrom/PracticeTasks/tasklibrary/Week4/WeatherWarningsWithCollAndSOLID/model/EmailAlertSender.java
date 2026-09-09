package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.WeatherWarningsWithCollAndSOLID.model;

public class EmailAlertSender implements WeatherAlertSender {

    public void sendAlert(String message) {
        IO.println("EMAIL: " + message);
    }
}
