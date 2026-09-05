package se.chasacademy.PracticeTasks.taskLibrary;

public class Conditions {
    public static void start() {
        String input = IO.readln("Give me a number less than zero:\n");
        int number = Integer.parseInt(input); //Convert to integer

        if (number < 0) {
            IO.println("Thank you!");
        }
    }
}
