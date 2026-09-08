package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week2.MethodsAndPassByValue;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;

public class MethodsAndPassByValue implements TaskTemplate {
    @Override
    public void start() {
        Person person = new Person("John Smith", 25);
        IO.println(String.format("%s är %d år gammal", person.getName(), person.getAge()));
        Person.birthday(person);
        IO.println(String.format("%s är %d år gammal nu", person.getName(), person.getAge()));


    }
}
