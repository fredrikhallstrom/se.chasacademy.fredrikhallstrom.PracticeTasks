package se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.ClassForBook;

import se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.TaskTemplate;

public class ClassForBook implements TaskTemplate {
    @Override
    public void start() {
        Book[] books = {
                new Book("Spill", "Sigrid Combuchen"),
                new Book("Kallocain", "Karin Boye"),
                new Book("Mannen som sökte sin skugga", "David Lagercrantz"),
        };

        for (Book book : books) {
            IO.println(book);
        }
    }
}
