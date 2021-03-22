package models;

import Enum.AccountStatus;
import exceptions.InsufficientValuesException;
import exceptions.InvalidValuesException;
import exceptions.NegativeValuesException;
import exceptions.OutRangeValuesException;

public abstract class Account {
    protected String accountNumber;
    protected int id;
    protected double interest;
    protected double balance;
    protected AccountStatus accountStatus;

    public Account() {
        this.accountStatus = AccountStatus.ACTIVE;
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getId() {
        return id;
    }

    public double getInterest() {
        return interest;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double depositAmount) throws NegativeValuesException;

    public abstract void withdraw(double withdrawalAmount) throws NegativeValuesException, OutRangeValuesException, InvalidValuesException, InsufficientValuesException;

    public abstract String print();

}