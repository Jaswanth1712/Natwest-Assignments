package HighestTransaction;



import CustomerBalances.Account;

import java.time.LocalDateTime;
import java.util.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Test {
    public static void main(String []args){
        List<Transaction> transactions=new ArrayList<>();

        transactions.add(new Transaction(1, 100, LocalDate.now(), 12345));
        transactions.add(new Transaction(2, 200,LocalDate.now(), 23456));
        transactions.add(new Transaction(3, 300,LocalDate.now(), 34567));
        transactions.add(new Transaction(4, 400,LocalDate.now(), 45678));
        transactions.add(new Transaction(5, 200,LocalDate.now(), 12345));

        Transaction maxi=transactions.stream().max(Comparator.comparing(Transaction::getAmount)).orElseThrow(NoSuchElementException::new);

System.out.println("maximum amount: "+maxi.getAmount());
        System.out.println(maxi.getTimestamp());


        //problem no.5 recent transaction
LocalDate pastDate=LocalDate.parse("2022-01-01");
        List<Transaction> date=transactions.stream().filter(n->n.getTimestamp().isAfter(pastDate)).collect(toList());

        date.forEach(s->System.out.println("after date transactions id: "+s.getId()));



        //problem no.6  transaction statistics

        Transaction mini=transactions.stream().min(Comparator.comparing(Transaction::getAmount)).orElseThrow(NoSuchElementException::new);

        System.out.println("minimum amount: "+mini.getAmount());

        OptionalDouble average = transactions.stream().mapToDouble(Transaction::getAmount).average();

        System.out.println("average amount: "+average);

    long countoft=transactions.stream().count();
        System.out.println("count of transactions: "+countoft);

        Double totalamount=transactions.stream().mapToDouble(Transaction::getAmount).sum();
        System.out.println("total amount: "+totalamount);




        //problem no.7  unique  account numbers
        Set<Integer>uniqueno=transactions.stream().map(Transaction::getAccountNumber).collect(Collectors.toSet());

        System.out.println("unique account numbers:"+uniqueno);



        //
    }
}
