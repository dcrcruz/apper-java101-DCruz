package oop.blueprint;

public class App {
    public static void main(String[] args) {
        Person mark = new Person();
        mark.age = 19;
        mark.name = "Mark Caguioa";
        mark.isMale = true;

        System.out.println(mark.getNameWithPrefix());
        mark.getJob();
    }
}
