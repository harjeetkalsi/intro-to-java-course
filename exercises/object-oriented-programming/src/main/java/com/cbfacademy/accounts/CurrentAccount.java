package com.cbfacademy.accounts;

public class CurrentAccount extends Account{

    private double intrest;

    public CurrentAccount(double balance, int accountNumber, double intrest) {
        super(balance, accountNumber);
        this.intrest = intrest;
    }
    
    public void addIntrest(int years){
      super.balance += (years * intrest);
    }
}
