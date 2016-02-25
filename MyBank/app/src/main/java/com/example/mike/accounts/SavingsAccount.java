package com.example.mike.accounts;

import com.example.mike.accounts.BankAccount;

/**
 * Created by Mike on 2/9/2015.
 */
public class SavingsAccount extends BankAccount {
    private static final String TAG = "SavingsAccount";

    @Override
    public void withdraw(double amount) {
        if(numberOfWithdraws() >= 3){
            return;
        }
        super.withdraw(amount);
    }
}
