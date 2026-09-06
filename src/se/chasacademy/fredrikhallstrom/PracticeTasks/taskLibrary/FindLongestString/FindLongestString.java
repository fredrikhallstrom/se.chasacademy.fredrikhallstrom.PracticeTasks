package se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.FindLongestString;

import se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.TaskTemplate;

public class FindLongestString implements TaskTemplate {
    @Override
    public void start() {
        String[] names = {
                "Alexander",
                "Benjamin",
                "Claes",
                "My",
                "Christoffer",
                "Theodor",
                "Maximus"
        };

        String longestName = "";
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        IO.println(String.format("Det längsta namnet är %s", longestName));
    }
}
