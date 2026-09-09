package se.chasacademy.fredrikhallstrom.PracticeTasks.ui;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Tasks;
import se.chasacademy.fredrikhallstrom.PracticeTasks.util.InputReader;

import java.io.IOException;

public class PracticeMenu {
    public static void practiceMenu(Tasks task) {
        String name = task.getDisplayName();
        int choice;
        while (true) {
            IO.println(String.format("Detta är övningsuppgift %s!", name));
            IO.println("---------------------------\n");
            IO.println("""
                    1. Starta kod
                    2. Visa kod
                    3. Visa Reflektioner
                    4. Återgå till föregående meny""");

            choice = InputReader.readInt("(siffra) >");

            switch (choice) {
            case 1 -> {
                try {
                    IO.println("\n----Start----\n");
                    task.start();
                    IO.println("\n****-Slut-****\n");
                    IO.readln("Tryck Enter för att fortsätta...");
                } catch (ReflectiveOperationException e){
                    IO.println("Felaktigt angiven övningsuppgift");
                } catch (RuntimeException e) {
                    IO.println("Uppgiften kraschade.");
                    e.printStackTrace();
                }
            }
            case 2 -> {
                IO.println("\n----Start av kod----\n");
                try {
                    IO.println(task.getCode());
                } catch (IOException e) {
                    IO.println("Något gick fel...");
                }
                IO.println("\n****-Slutet av kod-*****");
                IO.readln("Tryck Enter för att fortsätta...");
            }
            case 3 -> {
                IO.println("\n----Start reflektioner----\n");
                try {
                    IO.println(task.getReflections());
                } catch (IOException e) {
                    IO.println("Något gick fel...");
                }
                IO.println("\n****-Slut av reflektion-*****\n");
                IO.readln("Tryck Enter för att fortsätta...");
            }
            case 4 -> {
                return;
            }

            default -> IO.println("Ogiltigt val.");

            }
        }
    }

}
