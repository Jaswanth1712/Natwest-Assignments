import java.time.LocalDateTime;

public class Transaction {
    private double amount;
    private long accountNumber;
    private LocalDateTime date;

    public Transaction(double amount, long accountNumber) {
        if (amount < 0) {
            throw new NegativeAmountException("Negative amounts are not allowed.");
        }

        this.amount = amount;
        this.accountNumber = accountNumber;
        this.date = LocalDateTime.now();
    }

    public double getAmount() {
        return amount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Amount: " + amount +
                "\nAccount Number: " + accountNumber +
                "\nDate: " + date;
    }

    public String withdraw(double amount) {
        if (amount < 0) {
            return "Withdrawal amount cannot be negative.";
        }
double accountBalance= Account.getAccountBalance();
        if(accountBalance<amount){
            return "Failure";
        }
        else{
            accountBalance-=amount;

            return "Success";
        }
        // Implement the withdrawal logic
        // Update account balance
        // Return transaction status: success or failure
    }

    public String deposit(double amount) {
        if (amount < 0) {
            return "Deposit amount cannot be negative.";
        }

        double accountBalance= Account.getAccountBalance();


        // Implement the deposit logic
        // Update account balance
        // Return transaction status: success or failure
    }

    public String transferAmount(double amount, long targetAccountNumber) {
        if (amount < 0) {
            return "Transfer amount cannot be negative.";
        }

        // Implement the transfer logic
        // Update account balances for both sender and receiver
        // Return transaction status: success or failure
    }
}


