package com.chickpeabank.models;

import com.chickpeabank.exceptions.InsufficientValuesException;
import com.chickpeabank.exceptions.InvalidValuesException;
import com.chickpeabank.exceptions.NegativeValuesException;
import com.chickpeabank.exceptions.OutRangeValuesException;

public class SavingAccount extends Account {
    final double INTEREST_AMOUNT = 0.0001;

    public SavingAccount(String accountNumber){
        this.interest = INTEREST_AMOUNT;
        this.accountNumber = accountNumber;
    }


    public void deposit(double depositAmount) throws NegativeValuesException, InvalidValuesException {
        final double MINIMAL_DEPOSIT_VALUE = 0;
        if (depositAmount < MINIMAL_DEPOSIT_VALUE) {
            throw new NegativeValuesException();
        }
        if(depositAmount == MINIMAL_DEPOSIT_VALUE){
            throw new InvalidValuesException();
        }
        this.balance = this.balance + depositAmount;
    }

    public void withdraw(double withdrawalAmount) throws NegativeValuesException, OutRangeValuesException, InvalidValuesException, InsufficientValuesException {

        final double MINIMAL_WITHDRAWAL_VALUE = 0;
        final double MAXIMAL_WITHDRAWAL_VALUE = 1000.0;

        if (withdrawalAmount > MAXIMAL_WITHDRAWAL_VALUE) {
            throw new OutRangeValuesException();
        }
        if(withdrawalAmount < MINIMAL_WITHDRAWAL_VALUE){
            throw new NegativeValuesException();
        }
        if(withdrawalAmount == MINIMAL_WITHDRAWAL_VALUE){
            throw new InvalidValuesException();
        }
        if(this.balance < withdrawalAmount){
            throw new InsufficientValuesException();
        }
        this.balance = this.balance - withdrawalAmount;
    }


    @Override
    public String print() {
        final String detail = "Id Account " + getId() + " Balance Account " + this.balance
                + " Account Status " + getAccountStatus();
        return detail;
    }
}
