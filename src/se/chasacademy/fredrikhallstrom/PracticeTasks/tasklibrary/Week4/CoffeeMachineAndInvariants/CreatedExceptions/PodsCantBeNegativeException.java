package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.CoffeeMachineAndInvariants.CreatedExceptions;

public class PodsCantBeNegativeException extends IllegalArgumentException {
    public PodsCantBeNegativeException(String message) {
        super(message);
    }
}