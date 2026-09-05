package se.chasacademy.PracticeTasks.taskLibrary.MethodsAndPassByValue;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static void birthday(Person person) {
        person.age = person.age + 1;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
