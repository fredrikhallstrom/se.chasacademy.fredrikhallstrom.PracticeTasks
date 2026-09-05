package se.chasacademy.PracticeTasks.ui;

import se.chasacademy.PracticeTasks.Helpers;
import se.chasacademy.PracticeTasks.taskLibrary.Tasks;

public class PracticeMenu {
    public static void practiceMenu(Tasks task) {
        String name = task.getDisplayName();

        while (true) {
            IO.println(String.format("Detta är övningsuppgift %s!", name));
            IO.println("---------------------------\n");
            IO.println("""
                    1. Starta kod
                    2. Visa kod
                    3. Återgå till föregående meny""");
            int choice = Helpers.readlnStrToInt("(siffra)>");
            switch (choice) {
                case 1 -> {
                    IO.println("\n----Start----\n");
                    task.start();
                    IO.println("\n****-Slut-****\n");
                    IO.readln("Tryck Enter för att fortsätta...");
                }
                case 2 -> {
                    IO.println("\n----Start av kod----\n");
                    try {
                        IO.print(task.getCode());
                    } catch (Exception e) {
                        IO.println("Något gick fel...");
                    }
                    IO.println("\n\n****-Slutet av kod-*****");
                    IO.readln("Tryck Enter för att fortsätta...");
                }
                case 3 -> {
                    return;
                }

                default -> IO.println("Ogiltigt val.");

            }
        }
    }

}
