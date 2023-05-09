package day4.accessmodifiers;

import accessmodifiers.financial.Balance;

public class Account {
    void displayBalance() {
        Balance balance = new Balance();
        balance.setAmount = 100; // should be ERROR

        System.out.println(balance.getBalance());
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.displayBalance();
    }
}
