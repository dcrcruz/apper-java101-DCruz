package day4.Scratch.accessmodifiers.financial;

public class Balance {
    public int amount;
    public int setAmount;

    public int getBalance() {
        return amount;
    }

    public void setAmount(int amount) {
        if(amount < 900) {
            this.amount = 900;
        } else {
            this.amount = amount;
        }
    }
}
