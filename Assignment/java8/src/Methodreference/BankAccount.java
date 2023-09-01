package Methodreference;

public class BankAccount {
    private String accountNumber;
    private Double balance;

    public BankAccount(String accountNumber,Double balance ) {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
