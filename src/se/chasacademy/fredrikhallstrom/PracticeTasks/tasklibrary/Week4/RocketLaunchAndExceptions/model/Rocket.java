package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week4.RocketLaunchAndExceptions.model;

public class Rocket {
    private String rocketName;
    private int fuelLevel;

    public Rocket(String rocketName, int fuelLevel) {
        this.rocketName = rocketName;
        if (fuelLevel < 0 || fuelLevel > 100) {
            throw new IllegalArgumentException();
        } else {
            this.fuelLevel = fuelLevel;
        }
    }

    @Override
    public String toString() {
        return rocketName + " " + fuelLevel + "% of 100%";
    }
}
