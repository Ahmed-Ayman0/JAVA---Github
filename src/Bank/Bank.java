package Bank;

public class Bank {

    private  String accountNumber;//    should be final
    private String ownerName;
    private double balance;


    public Bank() {}

    public Bank(String accountNumber, String ownerName, double balance) {

        if (balance < 0) {
            throw new IllegalArgumentException("Invalid balance");
        }

        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number cannot be null or empty");
        }
        if (ownerName == null ||ownerName.trim().isBlank() ) {
            throw new IllegalArgumentException("Owner name cannot be null or empty");
        }
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(" Amount must be positive ");
        } else
            balance += amount;
    }


    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else if (amount > balance) {
            System.out.println("insufficient Balance");
        } else
            balance -= amount;

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
        if (ownerName==null || ownerName.isBlank()) {
            throw new IllegalArgumentException("Owner name cannot be null or empty");
        }
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }


}



