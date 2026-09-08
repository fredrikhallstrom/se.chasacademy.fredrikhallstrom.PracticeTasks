package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.AnimalsAndInherits.model;

public class Turtle extends Animal {
    public Turtle(String name) {
        super(name);
    }



    @Override
    public String toString() {
        return "Turtle: " + name;
    }
}
