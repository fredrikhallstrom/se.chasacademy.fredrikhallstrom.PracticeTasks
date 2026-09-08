package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public interface TaskTemplate {
    void start();

    default String getReflections() throws IOException {
        Path file = Path.of("src", getClass().getPackage().getName().replace(".", "/") + "/reflections.md");
        try {
            return Files.readString(file).stripTrailing();
        } catch (NoSuchFileException e) {
            return "Inga reflektionsanteckningar finns för den här uppgiften.\n";
        }
    }
}
