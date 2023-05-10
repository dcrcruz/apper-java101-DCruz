package day4.Scratch.inheritance.person;

public class Visitor extends Human{
    // not necessary due to inheritance
    // private String name; // name of visitor
    // private int age; // age of visitor

    // public Visitor(String name, int age) {
    //     return setName("Visitor");
    //     return setAge(21);
    // }

    public int getAge() {
        // retrieve age of visitor
        // call getter for getAge
        // use 'super' to use parent class (e.g. Human) highest
        return super.getAge(); 
    }
}
