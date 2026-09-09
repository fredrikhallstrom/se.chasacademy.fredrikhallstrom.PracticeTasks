package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.WeatherWarningsWithCollAndSOLID.model;

public class RadioAlertSender implements WeatherAlertSender {

    public void sendAlert(String message) {
        IO.println("RADIO: " + message);
    }
}
