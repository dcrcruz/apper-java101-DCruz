package oop.blueprint;

// set to 'public' to make class accessible
public class Person {
    public String name;
    public int age;
    public double weight;
    public String contactNumber;
    public boolean isMale;
    public double height;
    public String birthDate;
    public String citizenship;
    public String address;
    public String relationshipStatus;
    public String eyeColor;
    public String religion;
    public String email;
    public String birthPlace;
    public String occupation;
    public boolean hasSiblings;
    public String ethnicity;

    public String getNameWithPrefix() { // method should have 'return' if not void
        String prefix = "Mr.";
        if(!isMale) {
            if(relationshipStatus.equals("single")) {
                prefix = "Ms.";
            } else {
                prefix = "Mrs.";
            }
        }
        
        return prefix + name;
    }

    public void getJob() { // if void, no return
        System.out.println("Searching Linkedin...");
    }
}
