
package Banking_System;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Customer> customers;
    private List<Transaction> transactions;


    public Bank(List<Customer> customers, List<Transaction> transaction) {
        this.customers = customers;
        this.transactions = transaction;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}