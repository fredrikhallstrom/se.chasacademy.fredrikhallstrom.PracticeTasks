package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.MoviesWithCollections.model;

public class Movie {
    String movieTitle;
    String director;

    public Movie(String movieTitle, String director) {
        this.movieTitle = movieTitle;
        this.director = director;
    }

    @Override
    public String toString() {
        return movieTitle + ", Regisserad av " + director;
    }
}
