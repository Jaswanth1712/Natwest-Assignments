package CustomerBalances;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class Account {

    private int balance;

    private int accountNumber;

    public Account( int balance, int accountNumber) {

        this.balance = balance;

        this.accountNumber = accountNumber;
    }



    public int getBalance() {
        return balance;
    }



    public int getAccountNumber() {
        return accountNumber;
    }
}
