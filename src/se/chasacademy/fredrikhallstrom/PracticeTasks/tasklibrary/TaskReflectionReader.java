package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class TaskReflectionReader {
    private TaskReflectionReader() {} // Stänger konstruktor

    public static String getReflections(Class<? extends TaskTemplate> taskClass) throws IOException {
        Path file = Path.of("src", taskClass.getPackageName().replace(".", "/") + "/Reflections.md");
        try {
            return Files.readString(file).stripTrailing();
        } catch (NoSuchFileException e) {
            return "Inga reflektionsanteckningar finns för den här uppgiften.";
        }
    }
}
