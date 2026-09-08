package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week1.Hello;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;

public class Hello implements TaskTemplate {
    @Override
    public void start() {
        IO.println("Hello World");
    }
}
