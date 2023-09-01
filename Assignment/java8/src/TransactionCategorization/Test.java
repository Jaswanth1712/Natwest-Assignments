package TransactionCategorization;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Test {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1, 100.0, LocalDateTime.now(), 12345, "a"));
        transactions.add(new Transaction(2, 150.0, LocalDateTime.now(), 67890, "b"));
        transactions.add(new Transaction(3, 200.0, LocalDateTime.now(), 12345, "a"));
        transactions.add(new Transaction(4, 50.0, LocalDateTime.now(), 23456, "c"));
        transactions.add(new Transaction(5, 300.0, LocalDateTime.now(), 67890, "b"));


        Map<String,List<Transaction>>trans=transactions.stream().collect(Collectors.groupingBy(Transaction::getCategory));

        System.out.println("Category Transactions:" );

        for (Map.Entry<String, List<Transaction>> entry : trans.entrySet()){
            List<Transaction>temp=entry.getValue();
            System.out.println("Category: "+entry.getKey());
            Double totalamount=temp.stream().mapToDouble(Transaction::getAmount).sum();
            System.out.println("total amount: "+totalamount);




        }

    }
}