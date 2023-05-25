package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class miniGcash {
    public static void main(String[] args) {
        // Create a HashMap to store users
        Map<String, User> userMap = new HashMap<>();

        // Add existing users with names, mobile numbers, and balance
        userMap.put("09175861661", new User("Bob", "09175861661", 100));
        userMap.put("09175861662", new User("Marley", "09175861662", 100));
        userMap.put("09175861663", new User("Seth", "09175861663", 100));
        userMap.put("09175861664", new User("Ryan", "09175861664", 100));
        userMap.put("09175861665", new User("Fritz", "09175861665", 100));

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //header
        System.out.println("***** miniGCash *****");
        System.out.println("**Register an account**");

        // Register users
        while (true) {
            System.out.print("Enter mobile number (or type 'done' to exit): ");
            String mobileNumber = scanner.nextLine();

            if (mobileNumber.equalsIgnoreCase("done")) {
                break;
            }

            if (userMap.containsKey(mobileNumber)) {
                System.out.println("Mobile number already exists. Please enter another mobile number.");
                continue;
            }

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Please enter a name.");
                continue;
            }

            // Add the new user with a balance of 100
            userMap.put(mobileNumber, new User(name, mobileNumber, 100));
            System.out.println("User registered successfully!");
        }

        // Share load
        while (true) {
            System.out.print("Enter sender's mobile number (or 'done' to exit): ");
            String senderMobileNumber = scanner.nextLine();

            if (senderMobileNumber.equalsIgnoreCase("done")) {
                break;
            }

            if (!userMap.containsKey(senderMobileNumber)) {
                System.out.println("Sender mobile number not found. Please enter a registered mobile number.");
                continue;
            }

            System.out.print("Enter recipient's mobile number: ");
            String recipientMobileNumber = scanner.nextLine();

            if (!userMap.containsKey(recipientMobileNumber)) {
                System.out.println("Recipient mobile number not found. Please enter a registered mobile number.");
                continue;
            }

            if (senderMobileNumber.equals(recipientMobileNumber)) {
                System.out.println("Sender and recipient numbers are the same. Please enter different mobile numbers.");
                continue;
            }

            System.out.print("Enter amount to share: ");
            double amount = Double.valueOf(scanner.nextLine());

            User sender = userMap.get(senderMobileNumber);
            User recipient = userMap.get(recipientMobileNumber);

            if (sender.getBalance() < amount) {
                System.out.println("Insufficient balance. Please enter a valid amount.");
                continue;
            }

            // Share load successful
            sender.setBalance(sender.getBalance() - amount);
            recipient.setBalance(recipient.getBalance() + amount);
            System.out.println("Balance shared successfully!");
        }

        // Display all users and their remaining balances
        System.out.println("User balances:");
        for (Map.Entry<String, User> entry : userMap.entrySet()) {
            User user = entry.getValue();
            System.out.println("Mobile Number: " + user.getMobileNumber() + ", Name: " + user.getName() +
                    ", Balance: " + user.getBalance());
        }
    }
}

class User {
    private String name;
    private String mobileNumber;
    private double balance;

    public User(String name, String mobileNumber, double balance) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}