import java.time.LocalDateTime;
import java.util.*;

class Customer {
    private static int lastCustomerId = 1000;

    private int customerID;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private long phoneNumber;
    private LocalDateTime joiningDate;

    public Customer(String firstName, String lastName, String address, String city, long phoneNumber, LocalDateTime joiningDate) {
        this.customerID = ++lastCustomerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.joiningDate = joiningDate;
    }

    // Getters and setters

    @Override
    public String toString() {
        return customerID + ", " + firstName + ", " + lastName + ", " + address + ", " +
                city + ", " + phoneNumber + ", " + joiningDate;
    }

    public static Customer generateCustomer(String customerData) {
        // Parse the customerData and create a new Customer instance
        // Return the created Customer object

    }
}





