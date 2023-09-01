import java.time.LocalDate;

public class Account {
    private static long lastAccountNumber = 100000;

    private long accountNumber;
    private static double accountBalance;
    private Category accountType;
    private int customerID;
    private LocalDate dateOpened;

    // Parameterized constructor
    public Account(double initialBalance, Category accountType, int customerID) {
        this.accountNumber = generateAccountNumber();
        this.accountBalance = initialBalance;
        this.accountType = accountType;
        this.customerID = customerID;
        this.dateOpened = LocalDate.now();
    }

    // Default constructor
    public Account() {
        this.accountNumber = generateAccountNumber();
    }

    // Getters and setters
    public long getAccountNumber() {
        return accountNumber;
    }

    public static double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Category getAccountType() {
        return accountType;
    }

    public void setAccountType(Category accountType) {
        this.accountType = accountType;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public LocalDate getDateOpened() {
        return dateOpened;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                "\nAccount Balance: " + accountBalance +
                "\nAccount Type: " + accountType.getTypeName() +
                "\nCustomer ID: " + customerID +
                "\nDate Opened: " + dateOpened;
    }

    public static Account generateAccount(String accountData) {
        // Parse the accountData and create a new Account instance
        // Return the created Account object
    }

    private static synchronized long generateAccountNumber() {
        return ++lastAccountNumber;
    }
}
