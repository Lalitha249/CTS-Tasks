package com.cts;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 1000;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {

        if(amount > balance) {
            throw new IllegalArgumentException("Insufficient Balance");
        }

        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isPositive(int amount) {
        return amount > 0;
    }

}