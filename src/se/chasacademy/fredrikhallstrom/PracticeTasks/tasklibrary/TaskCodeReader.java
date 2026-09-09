package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TaskCodeReader {
    private TaskCodeReader() {} // Stängd konstruktor, den går inte att skapa en instans av klassen

    public static String getCode(Class<? extends TaskTemplate> taskClass) throws IOException {
        Path taskDirectory = Path.of("src", taskClass.getPackageName().replace(".", "/"));
        StringBuilder filesToPrint = new StringBuilder();
        try (Stream<Path> paths = Files.walk(taskDirectory)) {
            for (Path file : paths.filter(p -> p.toString().endsWith(".java")).sorted().toList()) {
                filesToPrint.append("---- ").append(taskDirectory.relativize(file)).append(" ----\n");
                filesToPrint.append(Files.readString(file).stripTrailing()).append("\n\n");
            }
        }

        return filesToPrint.toString().stripTrailing();
    }
}
