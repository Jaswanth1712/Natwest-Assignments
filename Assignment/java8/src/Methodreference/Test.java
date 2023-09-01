package Methodreference;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String []args){

        List<BankAccount> accounts=new ArrayList<>();

    accounts.add(new BankAccount("123", 123.0));
        accounts.add(new BankAccount("123", 123.0));

        double total=accounts.stream().mapToDouble(BankAccount::getBalance).sum();

        System.out.println("sum: " +total);
    }
}
