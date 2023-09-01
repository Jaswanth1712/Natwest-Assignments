package TransactionCategorization;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Transaction {
    private int id;
    private double amount;
    private LocalDateTime timestamp;
    private int accountNumber;
    private String category;

    public Transaction(int id, double amount, LocalDateTime timestamp, int accountNumber, String category) {
        this.id = id;
        this.amount = amount;
        this.timestamp = timestamp;
        this.accountNumber = accountNumber;
        this.category = category;
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

    public String getCategory() {
        return category;
    }
}
