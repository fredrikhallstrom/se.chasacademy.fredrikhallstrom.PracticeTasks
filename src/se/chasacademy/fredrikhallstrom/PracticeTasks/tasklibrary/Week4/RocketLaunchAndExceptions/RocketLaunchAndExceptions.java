package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.RocketLaunchAndExceptions;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.RocketLaunchAndExceptions.model.Rocket;

public class RocketLaunchAndExceptions implements TaskTemplate {
    public void start() throws IllegalArgumentException {
        try {
            Rocket rocket1 = new Rocket("Kalle", 34);
            Rocket rocket2 = new Rocket("Nisse", 54);
            Rocket rocket3 = new Rocket("Pelle", 101);
        } catch (IllegalArgumentException e) {
            IO.println("En raket kan inte ha under 0 % i tanken eller över 100%");
        }
    }
}
