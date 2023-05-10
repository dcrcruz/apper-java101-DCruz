package day4.Scratch.inheritance.person;

import day4.Scratch.inheritance.Animal;

public class Employee extends Human { //extends is inheritance
    // private String name; // not necessary due to inheritance
    private double salary; //employee salary

    public Employee(String name, double salary) {
        // this.name = name;
        this.salary = salary;
    }

    public void feedAnimal(Animal animal) {
        // allows employee to feed specific animal
    }

    public double getSalary() {
        //get employee salary
        return salary;
    }
}
