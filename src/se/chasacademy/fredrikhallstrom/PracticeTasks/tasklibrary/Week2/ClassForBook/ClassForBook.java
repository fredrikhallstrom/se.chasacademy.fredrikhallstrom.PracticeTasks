package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week2.ClassForBook;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;

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
