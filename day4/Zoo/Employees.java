package day4.Zoo;

public class Employees {
    private String name; // name of employee
    private double salary; //employee salary

    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void feedAnimal(Animals animal) {
        // allows employee to feed specific animal
    }

    public double getSalary() {
        //get employee salary
        return salary;
    }
}
