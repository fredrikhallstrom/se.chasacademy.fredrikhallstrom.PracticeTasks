package se.chasacademy.PracticeTasks.taskLibrary.ClassForBook;

public class ClassForBook {
    public static void start() {
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
