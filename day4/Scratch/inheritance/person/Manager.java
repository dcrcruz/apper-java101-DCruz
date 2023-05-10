package day4.Scratch.inheritance.person;

public class Manager extends Human {
    // not necessary due to inheritance
    // private String name; // manager name
    // private int age; // manager age
    private String initialTitle; // position of manager

    public Manager(String name, int age, String initialTitle) {
        // this.name = name;
        // this.age = age;
        this.initialTitle = initialTitle;
    }
}
