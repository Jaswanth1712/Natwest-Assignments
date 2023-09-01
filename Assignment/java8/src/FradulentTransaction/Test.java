package FradulentTransaction;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Test {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1, 100.0, LocalDateTime.now(), 12345, false));
        transactions.add(new Transaction(2, 200.0, LocalDateTime.now(), 67890, true));
        transactions.add(new Transaction(3, 300.0, LocalDateTime.now(), 12345, false));
        transactions.add(new Transaction(4, 500.0, LocalDateTime.now(), 23456, true));

        List<Transaction>fraud=transactions.stream().filter(Transaction::isFraudulent).collect(Collectors.toList());


        System.out.println("fraud transactions"+fraud);

        fraud.forEach(s->System.out.println(s.getId()));


    }
}