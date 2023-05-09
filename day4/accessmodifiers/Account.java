package day4.accessmodifiers;

import accessmodifiers.financial.Balance;

public class Account {
    void displayBalance() {
        Balance balance = new Balance();
        balance.amount = 100; // should be ERROR
    }
}
