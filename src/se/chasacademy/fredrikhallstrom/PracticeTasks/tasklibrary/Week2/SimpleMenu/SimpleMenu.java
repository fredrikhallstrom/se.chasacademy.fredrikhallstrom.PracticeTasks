package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week2.SimpleMenu;

import se.chasacademy.fredrikhallstrom.PracticeTasks.util.Helpers;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;

public class SimpleMenu implements TaskTemplate {
    @Override
    public void start() {
        while(true) {
            IO.println("""
                    1. Skriv ut en hälsning
                    2. Beräkna kvadraten av ett tal
                    3. Avsluta""");
            String choice = IO.readln("Gör ett val: ");
            switch (choice) {
                case "1" -> IO.println("Hej och välkommen!!");
                case "2" -> countSqareOfDigit();
                case "3" -> {
                    return;
                }
            }
        }
    }

    private static void countSqareOfDigit() {
        IO.println("Låt mig beräkna kvadraten av ett tal!");
        double dblInput = Helpers.readlnStrToDouble("Välj ett tal:");
        double dblSum = dblInput * dblInput;
        IO.println(String.format("Kvadraten av %.2f är %.2f, easy peasy :-D",  dblInput, dblSum));
        IO.readln("Tryck Enter för att fortsätta...");
    }

}
