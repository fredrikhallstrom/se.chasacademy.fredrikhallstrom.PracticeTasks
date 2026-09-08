package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.VehiclesAndSuper.model;

public class Motorcycle extends Vehicle {
    private boolean sideCart;

    public Motorcycle(String brand, boolean sideCart) {
        this.sideCart = sideCart;
        super(brand);
    }

    public String toString() {
        return "Motorcycle: " + brand + " (Sidecart: " + sideCart + ")";
    }
}
