package se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary;

import se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.ClassForBook.ClassForBook;
import se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.Conditions.Conditions;
import se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.Convert_string_to_digit.Convert_string_to_digit;
import se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.FindLongestString.FindLongestString;
import se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.Handle_Input.Handle_Input;
import se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.Hello.Hello;
import se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.MemberRegistry.MemberRegistry;
import se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.MethodsAndPassByValue.MethodsAndPassByValue;
import se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.SimpleMenu.SimpleMenu;
import se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.WeatherReport.WeatherReport;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

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
        return Files.readString(Path.of("src", submenuClass.getName().replace(".", "/") + ".java"));
    }

    public int getStudyWeek() {
        return studyWeek;
    }
}

