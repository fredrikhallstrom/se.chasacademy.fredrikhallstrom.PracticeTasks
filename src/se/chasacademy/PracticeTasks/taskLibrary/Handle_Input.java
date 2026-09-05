package se.chasacademy.PracticeTasks.taskLibrary;

public class Handle_Input {
    public static void start() {
        String name = IO.readln("Vad är ditt namn?\n");
        IO.println("Hej på dig " + name + "!");
    }
}
