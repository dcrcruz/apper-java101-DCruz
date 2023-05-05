public class Datatypes {
   
   // default values
   static int age; // 0
   static double salary; // 0.0 - same with float
   static boolean isHappy; // false
   static char faveLetter; // ascii ?
   static Integer wrapperAge;
   static boolean wrapperIsHappy;

    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(salary);
        System.out.println(isHappy);
        System.out.println(faveLetter);

        //wrapper
        System.out.println(age+ " " + wrapperAge);
        System.out.println(isHappy + " " + wrapperIsHappy);

        // in java, only objects can have null value
        // when null added to int (e.g. 10), will out error (add to nothing)

        int a = 9;
        int b = 10;
        int c = 78;

        System.out.println(a+b*c);

        // postfix vs prefix ++
        System.out.println(c++ + " " + ++a); //postfix - did not add, prefix, already added (output 78 10)
        System.out.println(c); // output 79 from postfix

    }
}
