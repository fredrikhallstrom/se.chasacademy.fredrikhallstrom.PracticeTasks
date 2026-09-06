package se.chasacademy.fredrikhallstrom.PracticeTasks.ui;

import se.chasacademy.fredrikhallstrom.PracticeTasks.Helpers;
import se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.Tasks;
import java.util.ArrayList;
import java.util.List;

public class WeekMenu {
    public static void weekMenu(int week) {
        while (true) {
            IO.println("\nVälj vilken Övningsuppgift du vill kolla på? Ange med siffra\n");
            List<Tasks> tasks = new ArrayList<>();
            for (Tasks iterTask : Tasks.values()) {  // Creates array with possible practicetaks
                if (iterTask.getStudyWeek() == week) {
                    tasks.add(iterTask);
                }
            }
            for (int i = 0; i < tasks.size(); i++) {
                IO.println(i + 1 + ". " + tasks.get(i).getDisplayName());
            }
            IO.println(String.format("%d. Återgå till föregående meny", tasks.size() + 1));
            int choice = Helpers.readlnStrToInt(">");
            if (choice >= 1 && choice < tasks.size() + 1) {
                PracticeMenu.practiceMenu(tasks.get(choice - 1));
            } else if (choice == tasks.size() + 1) {
                break;
            }
        }
    }
}