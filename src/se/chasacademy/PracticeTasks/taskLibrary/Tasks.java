package se.chasacademy.PracticeTasks.taskLibrary;

import java.lang.reflect.InvocationTargetException;
import java.nio.file.*;
import java.io.IOException;

// Import new practices here when using other than taskLibrary
import se.chasacademy.PracticeTasks.taskLibrary.ClassForBook.ClassForBook;
import se.chasacademy.PracticeTasks.taskLibrary.FindLongestString.FindLongestString;
import se.chasacademy.PracticeTasks.taskLibrary.MemberRegistry.MemberRegistry;
import se.chasacademy.PracticeTasks.taskLibrary.MethodsAndPassByValue.MethodsAndPassByValue;
import se.chasacademy.PracticeTasks.taskLibrary.SimpleMenu.SimpleMenu;
import se.chasacademy.PracticeTasks.taskLibrary.WeatherReport.WeatherReport;

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
    private final Class<?> submenuClass;
    private final int studyWeek;

    Tasks(int studyweek, String displayName, Class<?> submenuClass) {
        this.studyWeek = studyweek;
        this.displayName = displayName;
        this.submenuClass = submenuClass;
    }

    public void start() {
        try {
            submenuClass.getMethod("start").invoke(null);
        } catch (InvocationTargetException e) {
            IO.println("Uppgiften kraschade. ");
            e.getCause().printStackTrace();
        } catch (ReflectiveOperationException e) {
            IO.println("Felaktigt angedd övningsuppgift");
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

