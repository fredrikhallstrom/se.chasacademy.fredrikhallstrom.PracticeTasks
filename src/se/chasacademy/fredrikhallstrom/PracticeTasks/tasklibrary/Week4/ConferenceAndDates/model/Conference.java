package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.ConferenceAndDates.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Conference {
    String name;
    LocalDate date;


    public Conference(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        long daysToStart = ChronoUnit.DAYS.between(LocalDate.now(), date);
        String daysToStartOutput = daysToStart < 0 ? "Har varit" : daysToStart == 0 ? "Idag" : String.format("%d", daysToStart);

        // Samma sak som ovan fast inte en-radare
        /*if  (daysToStart == 0) {
            daysToStartOutput = "Idag";
        } else if (daysToStart < 0) {
            daysToStartOutput = "Har varit";
        } else {
            daysToStartOutput = String.valueOf(daysToStart);
        }
        */




        return name + " - " + date + ", Dagar kvar till konferans: " + daysToStartOutput;
    }
}
