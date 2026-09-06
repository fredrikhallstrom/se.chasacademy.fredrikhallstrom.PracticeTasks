package se.chasacademy.fredrikhallstrom.PracticeTasks;

public class Helpers {
    public static int readlnStrToInt(String prompt) {
        while (true) {
            String input = IO.readln(prompt);
            if (input == null) {
                IO.println("Ingen inmatning...");
                System.exit(0);
            }

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                IO.println("\nInte ett tal!!\n");
            }
        }
    }

    public static double readlnStrToDouble(String prompt) {
        while (true) {
            String input = IO.readln(prompt);
            if (input == null) {
                IO.println("Ingen inmatning...");
                System.exit(0);
            }

            input = input.replace(",", ".");

            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                IO.println("\nInte ett decimaltal!!\n");
            }
        }
    }
}
