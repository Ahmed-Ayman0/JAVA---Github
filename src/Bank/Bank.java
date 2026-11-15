package Bank;

public class Bank {

    private String accountNumber;
    private String ownerName;
    private double balance;


    public Bank() {
    }

    public Bank(String accountNumber, String ownerName, double balance) {

        if (balance < 0) {
            throw new IllegalArgumentException("Invalid balance");
        } else if (balance > 0) {
            System.out.println("Balance is " + balance);
        }

        if (accountNumber == null) {
            throw new IllegalArgumentException("Account number cannot be null or empty");
        }
        if (ownerName == null) {
            throw new IllegalArgumentException("Owner name cannot be null or empty");
        }
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else
            balance = balance + amount;
    }


    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else if (amount > balance) {
            System.out.println("insufficient Balance");
        } else
            balance = balance - amount;

    }


    public String displayAccountInfo() {
        return "Bank{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }


}



