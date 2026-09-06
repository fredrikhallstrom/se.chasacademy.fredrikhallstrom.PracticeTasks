package se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.ClassForBook;

public class Book {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override
    public String toString() {
        return getBookDetails();
    }
    //Getters

    public String getBookDetails() {
        return getTitle() + " av " + getAuthor();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
