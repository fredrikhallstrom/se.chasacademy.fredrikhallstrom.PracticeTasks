package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.CoffeeMachineAndInvariants;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.CoffeeMachineAndInvariants.CreatedExceptions.IllegalPodFillException;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.CoffeeMachineAndInvariants.CreatedExceptions.PodsCantBeNegativeException;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.CoffeeMachineAndInvariants.CreatedExceptions.PodsEmptyException;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.CoffeeMachineAndInvariants.model.CoffeeMachine;

public class CoffeeMachineAndInvariants implements TaskTemplate {
    public void start() throws IllegalArgumentException {
        try {
            CoffeeMachine coffeeMachine = new CoffeeMachine(10);
            coffeeMachine.brewCoffee();
            coffeeMachine.brewCoffee();
            coffeeMachine.refill(10);

        } catch (PodsCantBeNegativeException | PodsEmptyException | IllegalPodFillException
                message) {
            IO.println(message.getMessage());
        }
    }
}
