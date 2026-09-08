package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.AnimalsAndInherits;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.AnimalsAndInherits.model.Rabbit;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.AnimalsAndInherits.model.Turtle;

public class AnimalsAndInherits implements TaskTemplate {
    @Override
    public void start() {
        Turtle turtle1 = new Turtle("Harry");
        Rabbit rabbit1 = new Rabbit("Max");

        IO.println(turtle1);
        IO.println(rabbit1);

    }
}
