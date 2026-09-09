package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.CoffeeMachineAndInvariants.CreatedExceptions;

public class PodsEmptyException extends IllegalStateException {
    public PodsEmptyException(String message) {
        super(message);
    }
}
