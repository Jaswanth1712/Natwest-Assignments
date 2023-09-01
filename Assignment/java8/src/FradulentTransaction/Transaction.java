package FradulentTransaction;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Transaction {
    private int id;
    private double amount;
    private LocalDateTime timestamp;
    private int accountNumber;
    private boolean isFraudulent;

    public Transaction(int id, double amount, LocalDateTime timestamp, int accountNumber, boolean isFraudulent) {
        this.id = id;
        this.amount = amount;
        this.timestamp = timestamp;
        this.accountNumber = accountNumber;
        this.isFraudulent = isFraudulent;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean isFraudulent() {
        return isFraudulent;
    }
}