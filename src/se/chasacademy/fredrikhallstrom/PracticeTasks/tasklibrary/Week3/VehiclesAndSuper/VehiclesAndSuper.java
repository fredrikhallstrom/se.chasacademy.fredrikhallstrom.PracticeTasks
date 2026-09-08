package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.VehiclesAndSuper;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.VehiclesAndSuper.model.Car;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.VehiclesAndSuper.model.Motorcycle;

public class VehiclesAndSuper implements TaskTemplate {
    public void start() {
        Car car = new Car("Audi", 1);
        Car car2 = new Car("Volvo", 2);
        Motorcycle motorcycle = new Motorcycle("Suzuki", false);
        Motorcycle motorcycle2 = new Motorcycle("Honda", true);

        IO.println(car);
        IO.println(car2);
        IO.println(motorcycle);
        IO.println(motorcycle2);
    }

}
