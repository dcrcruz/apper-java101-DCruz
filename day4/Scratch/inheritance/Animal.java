package day4.Scratch.inheritance;

public class Animal {
    private String name; // name of animal
    private String type; // type of animal
    private String food; // specify food an animal eats

    public Animal(String name, String type, String food) {
        this.name = name;
        this.type = type;
        this.food = food;
    }

    public void produceSound() {
        // specifies sound an animal produces
    }

    public void chewFood() {
        // for if animal can chew food 
    }
}
