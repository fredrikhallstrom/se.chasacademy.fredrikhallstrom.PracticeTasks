package se.chasacademy.fredrikhallstrom.PracticeTasks.util;

import se.chasacademy.fredrikhallstrom.PracticeTasks.Exceptions.NoInputException;

public class InputReader {
    public static int readInt(String prompt) {
        while (true) {
            String inputFromUser = IO.readln(prompt);

            if (inputFromUser == null) {
                throw new NoInputException("Inmatningen avbröts!");
            }

            inputFromUser = inputFromUser.trim();
            if (inputFromUser.isEmpty()) {
                continue;
            }

            try {
                return Integer.parseInt(inputFromUser);
            } catch (NumberFormatException e) {
                IO.println("Inte ett tal, försök igen!!");
            }
        }
    }

    public static double readDouble(String prompt) {
        while (true) {
            String inputFromUser = IO.readln(prompt);

            if (inputFromUser == null) {
                throw new NoInputException("Inmatningen avbröts!");
            }

            inputFromUser = inputFromUser.trim();
            if (inputFromUser.isEmpty()) {
                continue;
            }

            try {
                return Double.parseDouble(inputFromUser);
            } catch (NumberFormatException e) {
                IO.println("Inte ett decimaltal, försök igen!!");
            }
        }
    }
}
