package se.chasacademy.fredrikhallstrom.PracticeTasks.ui;

import se.chasacademy.fredrikhallstrom.PracticeTasks.util.Helpers;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Tasks;

public class Menu {

    public static void mainMenu() {
        while (true) {
            IO.println("Välkommen till Fredrik Hallströms Övningsuppgifter!!");
            IO.println("----------------------------------------------------");
            IO.println("\nVilken vecka vill vi titta på?");
            int sumWeek = 0;
            for (int i = 0; i <= Tasks.values().length - 1; i++) {
                Tasks task = Tasks.values()[i];
                if (task.getStudyWeek() > sumWeek) {
                    sumWeek = task.getStudyWeek();
                }
            }
            for (int i = 1; i < sumWeek + 1; i++) {
                IO.println(String.format("%d. Vecka %d", i, i));
            }
            IO.println(String.format("%d. Avsluta", sumWeek + 1));
            int choice = Helpers.readlnStrToInt(">");

            if (choice > 0 && choice <= sumWeek) {
                WeekMenu.weekMenu(choice);
            } else if (choice == sumWeek + 1) {
                break;
            }
        }
    }
}
