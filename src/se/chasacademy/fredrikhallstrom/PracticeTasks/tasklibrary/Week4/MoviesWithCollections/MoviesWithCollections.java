package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.MoviesWithCollections;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.MoviesWithCollections.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MoviesWithCollections implements TaskTemplate {
    public void start() {
        List<Movie> movies = new ArrayList<Movie>();

        movies.add(new Movie("Matrix", "Nisse"));
        movies.add(new Movie("Jumanji", "Lasse Hallström"));
        movies.add(new Movie("Jurassic Park", "Unknown, may be eaten"));

        printMovies(movies);

        IO.println(movies.size());

        movies.remove(movies.get(1));

        IO.println(movies.size());

        printMovies(movies);

    }

    public void printMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            IO.println(movie);
        }
    }

}
