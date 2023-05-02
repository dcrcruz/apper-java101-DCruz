import java.util.Scanner;

public class PrimeNumberv2 {
        public static void main(String[] args) {
            //input range: 1 - 10_000_000
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to check if it is a prime number: ");
            long number = sc.nextInt();
            if(number >= 10000000) {
                System.out.println(number + " is not within the range of accepted values");
            }

            //call method
            if (isPrime(number)) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }

            //check speed
            long startTime = System.nanoTime();
            long endTime = System.nanoTime();
            System.out.println("Duration: " + (endTime - startTime));
        }

        static boolean isPrime(long num) { // method to check if prime number (original)
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= num / 2; i++) {
                if ((num % i) == 0)
                    return false;
            }
            return true;

        }
}
