package classes;

import interfaces.IBranch;

import java.util.ArrayList;

public class Branch implements IBranch {

    private String name;
    private ArrayList<Customer> customers;


    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, Double initialTransaction){
        if(findCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialTransaction);
            this.customers.add(customer);
            return true;
        }
        System.out.println("customer already exists");
         return false;
    }

    private Customer findCustomer(String customerName){
        for(Customer customer : customers){
            if(customerName.equals(customer.getName())) {
                return customer;
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer customer = findCustomer(customerName);
        if(customer == null){
            return false;
        }
        customer.getTransactions().add(transaction);
        return true;
    }
}
