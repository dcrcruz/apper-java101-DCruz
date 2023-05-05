public class Datatpes {
   
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
    }
}
