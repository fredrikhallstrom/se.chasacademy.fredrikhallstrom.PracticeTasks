package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.ConferenceAndDates;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.ConferenceAndDates.model.Conference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ConferenceAndDates implements TaskTemplate {
    public void start() {
        List<Conference> confs = new ArrayList<>();

        confs.add(new Conference("DataVetenskap", LocalDate.of(2026, 8, 12)));
        confs.add(new Conference("IT", LocalDate.of(2026, 12, 12)));
        confs.add(new Conference("Python", LocalDate.of(2026, 11, 12)));

        for  (Conference conf : confs) {
            IO.println(conf);
        }
    }
}
