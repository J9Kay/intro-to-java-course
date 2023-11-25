package com.cbfacademy.accounts;

public class Account {
    private int accountNumber;
    private double balance;

    // Constructor
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // Deposit funds into the account
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    // Withdraw funds from the account
    public double withdraw(double requested) {
        if (requested > 0 && requested <= balance) {
            balance -= requested;
            return requested;
        }
        return 0; // Negative amount or insufficient funds
    }

    @Override
    public String toString() {
        return "Account no: " + accountNumber + ", Balance: £" + String.format("%.2f", balance);
    }
    
}
