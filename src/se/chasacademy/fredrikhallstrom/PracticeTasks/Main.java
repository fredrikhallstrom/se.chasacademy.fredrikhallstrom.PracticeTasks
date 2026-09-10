import se.chasacademy.fredrikhallstrom.PracticeTasks.Exceptions.NoInputException;
import se.chasacademy.fredrikhallstrom.PracticeTasks.ui.Menu;

void main() {
    try {
        Menu.mainMenu();
    } catch (NoInputException e) {
        IO.println(e.getMessage());
    }
}
