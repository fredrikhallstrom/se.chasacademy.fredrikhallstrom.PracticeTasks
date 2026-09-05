package se.chasacademy.PracticeTasks.taskLibrary;

public class Handle_Input {
    void start() {
        String name = IO.readln("Vad är ditt namn?\n");
        IO.println("Hej på dig " + name + "!");
    }
}
