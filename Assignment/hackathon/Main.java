import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to NatWest Banking");
        System.out.println("Do you want to bank with us?");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter your account details in the following format:");
            System.out.println("First Name, Last Name, Address, City, Phone Number, Joining Date");
            String customerData = scanner.nextLine();
            Customer newCustomer = Customer.generateCustomer(customerData);

            System.out.println("Your customer details are:");
            System.out.println("CustomerID, First Name, Last Name, Address, City, Phone Number, Joining Date");
            System.out.println(newCustomer.toString());

            System.out.println("Do you want to create an account?");
            response = scanner.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Select the account type from the following:");
                System.out.println("1 Savings");
                System.out.println("2 Salary");
                int accountTypeChoice = scanner.nextInt();

                // Create an instance of the selected account category

                System.out.println("Enter the initial deposit amount:");
                double initialDeposit = scanner.nextDouble();

                // Create an instance of Account with the given details

                System.out.println("Your account details are:");
                System.out.println("AccountNo, AccountType, Initial Balance");
                // System.out.println(newAccount.toString());
            }

            System.out.println("Do you want to perform a transaction?");
            response = scanner.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Select the following option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Transfer");
                int transactionChoice = scanner.nextInt();

                // Based on the transaction choice, perform the respective operation

                System.out.println("Enter the amount:");
                double amount = scanner.nextDouble();

                try {
                    // Perform the transaction based on the choice
                } catch (NegativeAmountException ex) {
                    System.out.println("Transaction failed: " + ex.getMessage());
                }
            }
        }
    }
}