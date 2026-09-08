package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.LibraryAndComposition.model;

public class Book {
    private String bookName;
    private Author bookAuthor;

    public Book(String bookName, Author bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return bookName + " av " + bookAuthor;
    }
}
