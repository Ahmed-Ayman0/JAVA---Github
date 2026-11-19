package Bank;

public class Bank {

    private final String accountNumber;//    should be final
    private String ownerName;
    private double balance;
    private static int totalAccounts;



    //Constructor 1:
    public Bank(String accountNumber, String ownerName) {
        this(accountNumber, ownerName, 0);
        totalAccounts++;
    }


    //Constructor 2:
    public Bank(String accountNumber, String ownerName, double balance) {

        if (!Double.isFinite(balance) || balance < 0) {
            throw new IllegalArgumentException("Invalid balance");
        }

        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number cannot be null or empty");
        }
        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("Owner name cannot be null or empty");
        }
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException(" Amount must be positive ");
        }
        balance += amount;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Bank other = (Bank) obj;

        return accountNumber.equals(other.accountNumber)
                && ownerName.equals(other.ownerName)
                && Double.compare(balance, other.balance) == 0;
    }


    public void withdraw(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException(" Amount must be positive ");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient balance");
        }

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


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("Owner name cannot be null or empty");
        }
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}



