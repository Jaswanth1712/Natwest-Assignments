package TransactionAnalysis;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
class Transaction {
    private int id;
    private double amount;
    private LocalDateTime timestamp;
    private int accountNumber;

    public Transaction(int id, double amount, LocalDateTime timestamp, int accountNumber) {
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

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
