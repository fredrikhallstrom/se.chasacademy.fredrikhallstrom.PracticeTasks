package se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.Hello;

import se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.TaskTemplate;

public class Hello implements TaskTemplate {
    @Override
    public void start() {
        IO.println("Hello World");
    }
}
