package models;

public class SavingAccount extends Account {
    final double INTEREST_AMOUNT = 0.0001;

    public SavingAccount(String accountNumber){
        this.interest = INTEREST_AMOUNT;
        this.accountNumber = accountNumber;
    }




    @Override
    public String print() {
        return null;
    }
}
