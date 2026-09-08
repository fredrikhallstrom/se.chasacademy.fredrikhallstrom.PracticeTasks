package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week1.Handle_Input;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;

public class Handle_Input implements TaskTemplate {
    @Override
    public void start() {
        String name = IO.readln("Vad är ditt namn?\n");
        IO.println("Hej på dig " + name + "!");
    }
}
