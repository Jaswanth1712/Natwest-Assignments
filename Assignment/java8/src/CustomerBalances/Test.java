package CustomerBalances;
import example.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
public class Test {

    public static void main(String[] args){

        List<Account>accounts=new ArrayList<>();

     accounts.add(new Account(100,12345));
        accounts.add(new Account(200,23456));
        accounts.add(new Account(300,12345));
        accounts.add(new Account(400,23456));

        OptionalDouble average = accounts.stream().mapToInt(Account::getBalance).average();

    System.out.println("average amount: "+average);
    }
}
