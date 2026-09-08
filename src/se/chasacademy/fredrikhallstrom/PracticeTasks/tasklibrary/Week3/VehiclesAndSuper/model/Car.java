package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.VehiclesAndSuper.model;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        super(brand);
    }

    public String toString() {
        String doorOrDoors;
        if (numberOfDoors == 1) {
            doorOrDoors = "Door";
        } else {
            doorOrDoors = "Doors";
        }
        return "Car: " + brand + " (" + numberOfDoors + " " + doorOrDoors + ")";
    }


}
