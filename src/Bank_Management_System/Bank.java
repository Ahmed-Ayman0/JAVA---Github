//
//package Bank_Management_System;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Bank {
//
//    private List<Customer> customers;
//    private List<Transaction> transactions;
//
//
////    public Bank(List<Customer> customers, List<Transaction> transaction) {
////        this.customers = customers;
////        this.transactions = transaction;
////    }
//
//    public Bank() {
//        customers = new ArrayList<>();
//        transactions = new ArrayList<>();
//    }
//
//
//    public void addCustomer(Customer customer) {
//        customers.add(customer);
//    }
//
//    public void addTransaction(Transaction transaction) {
//        transactions.add(transaction);
//    }
//
//    // old make savingaccount
////    public void makeaccount(Customer customer , SavingsAccount account) {
////
////        customer.addSavings(account);
////    }
//    // Create Savings Account
//
//
//
//    public void makeAccount(Customer customer,
//                            SavingsAccount account) {
//
//        if (!customers.contains(customer)) {
//            throw new IllegalArgumentException(
//                    "Customer is not registered in this bank"
//            );
//        }
//
//        customer.addSavings(account);
//    }
//
//
//    // Create Cheque Account (Overloading)
//    public void makeAccount(Customer customer, ChequeAccount account) {
//
//        if (!customers.contains(customer)) {
//            throw new IllegalArgumentException(
//                    "Customer is not registered in this bank"
//            );
//        }
//
//        customer.addCheque(account);
//    }
//
//
////  old make chequeAccount
////    public void makeaccount(Customer customer , chequeAccount account) {
////        customers.add(customer);
////    }
//
//
//
//
//
//}
