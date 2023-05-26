package gcash.src;

public class User {
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
