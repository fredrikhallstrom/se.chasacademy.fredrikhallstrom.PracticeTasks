package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.AnimalsAndInherits.AnimalsAndInherits;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week2.ClassForBook.ClassForBook;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week1.Conditions.Conditions;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week1.Convert_string_to_digit.Convert_string_to_digit;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week2.FindLongestString.FindLongestString;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week1.Handle_Input.Handle_Input;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week1.Hello.Hello;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.LibraryAndComposition.LibraryAndComposition;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week2.MemberRegistry.MemberRegistry;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week2.MethodsAndPassByValue.MethodsAndPassByValue;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.Notifications.Notifications;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.PaymentSystem.PaymentSystem;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week2.SimpleMenu.SimpleMenu;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.VehiclesAndSuper.VehiclesAndSuper;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week2.WeatherReport.WeatherReport;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

// Import new practices here


public enum Tasks {
    HELLO(1, "Hello World", Hello.class),
    HANDLE_INPUT(1, "Inmatningshantering", Handle_Input.class),
    CONDITIONS(1, "Villkor", Conditions.class),
    CONVERT_STRING_TO_DIGIT(1,"Konvertera Sträng till Tal", Convert_string_to_digit.class),
    WEATHERREPORT(2,"Väderrapport", WeatherReport.class),
    FINDLONGESTSTRING(2, "Hitta det längsta namnet", FindLongestString.class),
    SIMPLEMENU(2,"Enkel meny med while-loop", SimpleMenu.class),
    CLASSFORBOOK(2, "Klass för bok", ClassForBook.class),
    METHODSANDPASSBYVALUE(2, "Metoder och pass-by-value", MethodsAndPassByValue.class),
    MEMBERREGISTRY(2, "Medlemsregistret", MemberRegistry.class),
    ANIMALSANDINHERTIS(3,"Djur och Arv", AnimalsAndInherits.class),
    VEHICLEANDSUPER(3, "Fordon och super", VehiclesAndSuper.class),
    NOTIFICATIONS(3, "Notifieringar", Notifications.class),
    PAYMENTSYSTEM(3, "Betalsystem", PaymentSystem.class),
    LIBRARYANDCOMPOSITION(3, "Bibliotek och komposition", LibraryAndComposition.class)
    ;

    private final String displayName;
    private final Class<? extends TaskTemplate> submenuClass;
    private final int studyWeek;

    Tasks(int studyWeek, String displayName, Class<? extends TaskTemplate> submenuClass) {
        this.studyWeek = studyWeek;
        this.displayName = displayName;
        this.submenuClass = submenuClass;
    }

    public void start() {
        try {
            submenuClass.getDeclaredConstructor().newInstance().start();
        } catch(ReflectiveOperationException e){
            IO.println("Felaktigt angiven övningsuppgift");
        } catch (RuntimeException e) {
            IO.println("Uppgiften kraschade.");
            e.printStackTrace();
        }

    }

    public String getDisplayName() {
        return displayName;
    }

    public String getCode() throws IOException {
        Path taskDirectory = Path.of("src", submenuClass.getPackageName().replace(".", "/"));
        StringBuilder filesToPrint = new StringBuilder();
        try (Stream<Path> paths = Files.walk(taskDirectory)) {
            for (Path file : paths.filter(p -> p.toString().endsWith(".java")).sorted().toList()) {
                filesToPrint.append("---- ").append(taskDirectory.relativize(file)).append(" ----\n");
                filesToPrint.append(Files.readString(file).stripTrailing()).append("\n\n");
            }
        }

        return filesToPrint.toString().stripTrailing();
    }

    public int getStudyWeek() {
        return studyWeek;
    }

    public String getReflections() {
        try {
            return submenuClass.getDeclaredConstructor().newInstance().getReflections();
        } catch (ReflectiveOperationException e) {
            return "Kunde inte läsa uppgiftens reflektioner.";
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

