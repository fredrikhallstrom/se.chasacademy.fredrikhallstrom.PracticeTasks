package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week1.Conditions;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;

public class Conditions implements TaskTemplate {
    @Override
    public void start() {
        String input = IO.readln("Give me a number less than zero:\n");
        int number = Integer.parseInt(input); //Convert to integer

        if (number < 0) {
            IO.println("Thank you!");
        }
    }
}
