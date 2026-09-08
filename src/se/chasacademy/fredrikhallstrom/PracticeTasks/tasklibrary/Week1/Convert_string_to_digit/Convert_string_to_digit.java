package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week1.Convert_string_to_digit;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;

public class Convert_string_to_digit implements TaskTemplate {
    @Override
    public void start() {
        String input_String = IO.readln("Give me a number to increment:\n");

        int number = Integer.parseInt(input_String); // Convert from text to integer
        number = number + 1; // Increment by one

        IO.println("Your new number is " + number); // Prints new number on screen
    }
}
