//
//package Bank_Management_System;
//
//public abstract class Account {
//
//    private String bsb;
//    private String accountNumber;
//    protected double balance;
//
//    public Account(String bsb, String accountNumber, double balance) {
//
//        this.bsb = bsb;
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//
//    public abstract void withdraw(double amount);
//
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//        }
//    }
//
//    public String getBsb() {
//        return bsb;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//}
