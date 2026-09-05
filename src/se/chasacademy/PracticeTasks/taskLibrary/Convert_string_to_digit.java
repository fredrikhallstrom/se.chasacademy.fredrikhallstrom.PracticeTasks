package se.chasacademy.PracticeTasks.taskLibrary;

public class Convert_string_to_digit {
    void start() {
        String input_String = IO.readln("Give me a number to increment:\n");

        int number = Integer.parseInt(input_String); // Convert from text to integer
        number = number + 1; // Increment by one

        IO.println("Your new number is " + number); // Prints new number on screen
    }
}
