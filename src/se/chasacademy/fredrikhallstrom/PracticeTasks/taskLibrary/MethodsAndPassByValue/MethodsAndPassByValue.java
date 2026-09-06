package se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.MethodsAndPassByValue;

import se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.TaskTemplate;

public class MethodsAndPassByValue implements TaskTemplate {
    @Override
    public void start() {
        Person person = new Person("John Smith", 25);
        IO.println(String.format("%s är %d år gammal", person.getName(), person.getAge()));
        Person.birthday(person);
        IO.println(String.format("%s är %d år gammal nu", person.getName(), person.getAge()));


    }
}
