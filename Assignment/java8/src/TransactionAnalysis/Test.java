package TransactionAnalysis;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Long.sum;


//import static java.util.stream.Nodes.collect;

public class Test {
   public static void main(String []args){
       List<Transaction> transactions=new ArrayList<>();

       transactions.add(new Transaction(1, 100,LocalDateTime.now(), 12345));
       transactions.add(new Transaction(2, 200,LocalDateTime.now(), 23456));
       transactions.add(new Transaction(3, 300,LocalDateTime.now(), 34567));
       transactions.add(new Transaction(4, 400,LocalDateTime.now(), 45678));
       transactions.add(new Transaction(5, 200,LocalDateTime.now(), 12345));

       Double totalamount=transactions.stream().filter(n->n.getAccountNumber()==12345).mapToDouble(Transaction::getAmount).sum();
       System.out.println("total amount: "+totalamount);




   }
}
