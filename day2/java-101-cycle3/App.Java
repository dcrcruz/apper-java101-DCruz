public class App {
    public static void main(String[] args) {
        System.out.println("Hello World"); //sout

        //Variables
        aboutVariables();

        //Strings - array of chars
        aboutStrings();


    }
    public static void aboutStrings() {
        char numberChar = '1'; //array of chars ['1','','',...]
        String myName = "derick";

        System.out.println(myName.toLowerCase());
        System.out.println(myName.toUpperCase());
        System.out.println(myName.substring(2,6)); //start inclusive, end is exclusive
    }

    public static void aboutVariables() {
        //numeric WHOLE data types; short, int, long
        int age = 15;
        age += 10;
        //System.out.println(age);

        //long
        long myBal = 1000000000;
        long newBal = myBal + age;
        System.out.println(newBal);

        //decimal: double and float;
        double price = 4.45;
        double newPrice = age + price;

        float discount = 9.56F;
        double subtotal = newPrice + discount;
        System.out.println(subtotal);

        //naming
        int _try123 = 1; //starts with _, you can name it any except for special chars
        int myGrade = 3; //by practice, camel case
        double MY_AVE = 3.0; //e.g. snake case; by practice use if all caps and static var
    }
}
