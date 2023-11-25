package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    double interestRate;



    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber,balance);
        this.interestRate = interestRate;


    }

    public void applyInterest() {
        double interest = getBalance() + ( interestRate/100);
        deposit(interest);
    

    }

    public double getInterestRate() {
        return interestRate;

    } 


    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;

    }
        

        



}

