public class SwitchStatements {
    public static void main(String[] args) {
        // DESC: animal sounds" dog = arf, cat = meow, goat = meh, cow = moo

        Animal animal = Animal.dog;

        // if else method
        // if (animal.equals("dog")) {
        //     System.out.println("arf");
        // } else if (animal.equals("cat")) {
        //     System.out.println("meow");
        // } else if (animal.equals("goat")) {
        //     System.out.println("meh");
        // } else if (animal.equals("cow")) {
        //     System.out.println("moo");
        // } else {
        //     System.out.println("yo");
        // }

        //Q: why use else if rather all if statements?
        //A: time complexity and efficient; if condition is met already, end if else
        
        // if (animal.equals("dog")) {
        //     System.out.println("arf");
        // }
        // if (animal.equals("cat")) {
        //     System.out.println("meow");
        // }

        // TIP: for boolean, use if

        // switch method
        // switch (animal) {
        //     case "dog": System.out.println("arf"); break; // break - exits fr switch statement
        //     case "cat": System.out.println("meow"); break;
        //     case "goat": System.out.println("meh"); break;
        //     case "cow": System.out.println("moo"); break;
        //     default: System.out.println("yo"); break; //if condition is not satisfied
        // }

        // for enum
        switch (animal) {
            case dog: System.out.println("arf"); break; // break - exits fr switch statement
            case cat: System.out.println("meow"); break;
            case goat: System.out.println("meh"); break;
            case cow: System.out.println("moo"); break;
            //default: System.out.println("yo"); break; //if condition is not satisfied
            //default was removed after adding 'enum' since constraint with avail values
        }

    }

    // enum - Enumerate
    // enum = limiting values to what was declared
    public enum Animal {
        dog,cat,goat,cow

    }
}
