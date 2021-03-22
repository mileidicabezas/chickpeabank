package models;
import Enum.MaritalStatus;
import exceptions.RepeatedValuesException;

import java.util.ArrayList;
import java.util.List;

public class Client {
    Account account;
    private String idNumber;
    private String clientName;
    private MaritalStatus maritalStatus;
    private List<Account> accountsList = new ArrayList<Account>();

    public Client(String id, String name, MaritalStatus maritalStatus){
        this.idNumber = id;
        this.clientName = name;
        this.maritalStatus = maritalStatus;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public List<Account> getAccountsList() {
        return accountsList;
    }
    public void addAccount(Account account) throws RepeatedValuesException {

        if(accountsList.contains(account)){
            throw new RepeatedValuesException();
        }
        this.accountsList.add(account);
    }

    public String print() {
        String detail = "Id Number: "+this.getIdNumber()+"\nName: "+this.getClientName()+
                "\nMarital Status: "+this.getMaritalStatus()+ "\nAccount number: " + getAccountsList();
        return detail;
    }
}
