package HighestTransaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
class Transaction {
    private int id;
    private double amount;
    private LocalDate timestamp;
    private int accountNumber;

    public Transaction(int id, double amount, LocalDate timestamp, int accountNumber) {
        this.id = id;
        this.amount = amount;
        this.timestamp = timestamp;
        this.accountNumber = accountNumber;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

