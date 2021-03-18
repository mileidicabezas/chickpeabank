package models;

public class CurrentAccount extends Account {
    final double INTEREST_AMOUNT = 0.00015;

    public CurrentAccount(String accountNumber){
        this.interest = INTEREST_AMOUNT;
        this.accountNumber = accountNumber;
    }

        @Override
        public String print() {
            return null;
        }
}
