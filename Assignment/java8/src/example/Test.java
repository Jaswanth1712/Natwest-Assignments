package example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[]args){

        List<Employee> employees=null;



        employees.add(new Employee("a", 1, 100));
        employees.add(new Employee("b", 2, 200));
        employees.add(new Employee("c", 3, 300));

        List<Employee>old30=employees.stream().filter(n->n.getAge()>30).collect(Collectors.toList());




//                List<Employee> raisedSalaries = older30.stream()
//                .peek(employee -> employee.setSalary(employee.getSalary() * 1.1))
//                .collect(Collectors.toList());
//
//        double totalRaisedSalaries = raisedSalaries.stream()
//                .mapToDouble(Employee::getSalary)
//                .sum();
//
//        System.out.println("Employees older than 30: " + olderThan30);
//        System.out.println("Salaries after 10% raise: " + raisedSalaries);
//        System.out.println("Total sum of raised salaries: " + totalRaisedSalaries);
    }
}
