package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.LibraryAndComposition;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.LibraryAndComposition.model.Author;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.LibraryAndComposition.model.Book;

public class LibraryAndComposition implements TaskTemplate {
    public void start() {
        Author authorA = new Author("Nisse Hult");
        Author authorB = new Author("Johanna Maj");
        Author authorC = new Author("Daniel Jackson");

        Book[] bookLibrary = new Book[] {
            new Book("The Lord of the Rings", authorA),
            new Book("Kan du vissla?", authorB),
            new Book("Lär dig rita", authorC),
        };

        for (Book book : bookLibrary) {
            IO.println(book);
        }
    }

}
