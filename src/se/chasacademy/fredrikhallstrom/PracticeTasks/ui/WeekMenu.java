package se.chasacademy.fredrikhallstrom.PracticeTasks.ui;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Tasks;
import se.chasacademy.fredrikhallstrom.PracticeTasks.util.InputReader;

import java.util.List;

public class WeekMenu {
    public static void weekMenu(int week) {
        while (true) {
            IO.println("\nVälj vilken Övningsuppgift du vill kolla på? Ange med siffra\n");

            List<Tasks> tasks = Tasks.tasksByWeek(week); // Hämtar aktuell uppgiftslista

            for (int i = 0; i < tasks.size(); i++) {
                IO.println(i + 1 + ". " + tasks.get(i).getDisplayName());
            }

            IO.println(String.format("%d. Återgå till föregående meny", tasks.size() + 1));

            int choice = InputReader.readInt(">");

            if (choice >= 1 && choice < tasks.size() + 1) { //Gör menyval
                PracticeMenu.practiceMenu(tasks.get(choice - 1));
            } else if (choice == tasks.size() + 1) { // Avlsutar
                break;
            } else { // Hanterar ogiltigt menyval
                IO.println("Inte ett giltigt menyval");
            }
        }
    }
}