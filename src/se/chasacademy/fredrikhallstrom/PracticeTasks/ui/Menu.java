package se.chasacademy.fredrikhallstrom.PracticeTasks.ui;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Tasks;
import se.chasacademy.fredrikhallstrom.PracticeTasks.util.InputReader;

public class Menu {

    public static void mainMenu() {
        while (true) {
            IO.println("Välkommen till Fredrik Hallströms Övningsuppgifter!!");
            IO.println("----------------------------------------------------");
            IO.println("\nVilken vecka vill vi titta på?");

            int highestWeek = Tasks.highestStudyWeek();

            for (int i = 1; i < highestWeek + 1; i++) {
                IO.println(String.format("%d. Vecka %d", i, i));
            }
            IO.println(String.format("%d. Avsluta", highestWeek + 1));
            int choice = InputReader.readInt("(siffra) >");

            if (choice > 0 && choice <= highestWeek) { // Gör menyval
                WeekMenu.weekMenu(choice);
            } else if (choice == highestWeek + 1) { // Avslutar
                break;
            } else { // Hanterar ogiltigt menyval
                IO.println("Inte ett giltigt menyval");
            }
        }
    }
}
