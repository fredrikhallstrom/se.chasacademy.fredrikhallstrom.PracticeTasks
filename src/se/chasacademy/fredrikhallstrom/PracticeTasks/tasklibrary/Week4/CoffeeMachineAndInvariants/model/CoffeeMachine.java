package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.CoffeeMachineAndInvariants.model;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.CoffeeMachineAndInvariants.CreatedExceptions.*;

public class CoffeeMachine {
    private int pods;

    public CoffeeMachine(int pods) {
        if (pods < 0) {
            throw new PodsCantBeNegativeException("Poddar kan inte vara mindre än noll");
        } else {
            this.pods = pods;
        }
    }

    @Override
    public String toString() {
        return "Antal poddar: " + pods + " st";
    }

    public void brewCoffee() {
        if (pods <= 0) {
            throw new PodsEmptyException("Fyll på poddar!!");
        } else {
            pods--;
            IO.println("Brygger en kopp Kaffe");
            IO.println(String.format("Poddar kvar: %d", pods));
        }
    }

    public void refill(int amount) {
        if  (amount <= 0) {
            throw new IllegalPodFillException("Kan inte fylla på med mindre än 1 podd");
        } else  {
            pods += amount;
            IO.println(String.format("Fyllde på med poddar: %d st\nNu finns det %d poddar", amount, pods));
        }
    }

}
