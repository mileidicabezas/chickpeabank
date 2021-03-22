package models;

import exceptions.InsufficientValuesException;
import exceptions.InvalidValuesException;
import exceptions.NegativeValuesException;
import exceptions.OutRangeValuesException;

public class CurrentAccount extends Account {
    final double INTEREST_AMOUNT = 0.00015;
    public CurrentAccount(String accountNumber){
        this.interest = INTEREST_AMOUNT;
        this.accountNumber = accountNumber;
    }

    @Override
    public void deposit(double depositAmount) throws NegativeValuesException {
        final double MINIMAL_DEPOSIT_VALUE = 0;
        double percentageAmount = 1.0;
        double percentageTotal = 100.0;
        if (depositAmount < MINIMAL_DEPOSIT_VALUE) {
          throw new NegativeValuesException();
        }
        if (depositAmount == MINIMAL_DEPOSIT_VALUE) {

        }
        percentageAmount = (depositAmount *  percentageAmount) / percentageTotal;
        this.balance = (this.balance + depositAmount) - percentageAmount;
    }

    @Override
    public void withdraw(double withdrawalAmount) throws NegativeValuesException, OutRangeValuesException, InvalidValuesException, InsufficientValuesException {
        final double MINIMAL_WITHDRAWAL_VALUE = 0;
        final double MAXIMAL_WITHDRAWAL_VALUE = 2000.0;

        if (withdrawalAmount < MINIMAL_WITHDRAWAL_VALUE) {
            throw new NegativeValuesException();
        }
        if (withdrawalAmount > MAXIMAL_WITHDRAWAL_VALUE) {
            throw new OutRangeValuesException();
        }
        if (withdrawalAmount == MINIMAL_WITHDRAWAL_VALUE) {
            throw new InvalidValuesException();
        }
        if (withdrawalAmount > this.balance) {
            throw new InsufficientValuesException();
        }
        this.balance = this.balance - withdrawalAmount;
    }

    @Override
        public String print() {
            return null;
        }
}
