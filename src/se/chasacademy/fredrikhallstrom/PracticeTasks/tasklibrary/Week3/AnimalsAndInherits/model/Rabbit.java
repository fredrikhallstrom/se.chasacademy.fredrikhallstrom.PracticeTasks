package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.AnimalsAndInherits.model;

public class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Rabbit: " + name;
    }
}
