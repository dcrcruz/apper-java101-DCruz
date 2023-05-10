package day4.Scratch.inheritance;

import day4.Scratch.inheritance.person.Manager;

public class ZooApp {
    public static void main(String[] args) {
        Manager manager1 = new Manager(null, 0, null);
        manager1.setName("Derick");
        manager1.setAge(21);

        System.out.println(manager1.getName());
    }
}
