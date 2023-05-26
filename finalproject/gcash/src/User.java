package gcash.src;

public class User implements canLoad, canShare {
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

    @Override
    public void shareLoad(User recipient, double amount) {
        if (this == recipient) {
            System.out.println("Error: Sender and recipient are the same. Enter different users.");
        } else if (this.balance < amount) {
            System.out.println("Error: Insufficient balance.");
        } 
        else {
            this.balance -= amount;
            recipient.loadBalance(amount);
            System.out.println(amount + " pesos successfully sent to " + recipient.getName() + ".");
        }
    }

    @Override
    public void loadBalance(double amount) {
        this.balance += amount;
        System.out.println(amount + " pesos successfully loaded to your account.");
    }
}
