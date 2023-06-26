package com.cbfacademy.accounts;

public class Account {
    
    double balance;
    private int accountNumber;

    public Account(double balance, int accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void makeDeposit(double moneyIn){
        this.balance += moneyIn;
    }

    public void withdrawMoney(double moneyOut){
        this.balance -= moneyOut;
    }

    public String getBalance(){
        return "The account balance for " + this.accountNumber + " is currently £" +this.balance;
    }


}
