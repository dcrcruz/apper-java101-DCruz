public class isPrimeNumberLec {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //while loop
        //aboutWhile();

        //do while loop
        //aboutDoWhile(); // checks the cond after execution; do first

        //for loop
        //aboutForLoop();

    }
    public static void aboutWhile() {
        int ctr = 0;
        while (ctr < 10) {
            ctr++;
            System.out.println(ctr);
        }
    }
    public static void aboutDoWhile() {
        int num=0;
        do{
            System.out.println(num);
            num++;
        } while (num<10);

    }
    public static void aboutForLoop() {
        for(int forNum=0; forNum < 10; forNum++) {
            System.out.println(forNum);
        }
    }
}
