package Bank;
import java.util.ArrayList;
import java.util.Objects;
public class Bank {

    private final String accountNumber;//    should be final
    private String ownerName;
    private double balance;
    private static int totalAccounts=0;


    private static ArrayList<Bank> accounts = new ArrayList<>();

    //Constructor 1:
    public Bank(String accountNumber, String ownerName) {
        this(accountNumber, ownerName, 0);

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
        accounts.add(this);
        totalAccounts++;
    }

    public static boolean DeleteAccount(String accountNumber) {

        for (int i = 0; i < accounts.size(); i++) {

            Bank account = accounts.get(i);

            if (account.getAccountNumber().equals(accountNumber)) {

                if (account.getBalance() > 0) {
                    System.out.println("Cannot delete account. Balance is not zero.");
                    return false;
                }

                accounts.remove(i);
                totalAccounts--;

                System.out.println("Account deleted successfully.");
                return true;
            }
        }

        System.out.println("Account not found.");
        return false;
    }


    public void deposit(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException(" Amount must be positive ");
        }
        balance += amount;
    }



    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Bank other = (Bank) obj;

        return this.accountNumber.equals(other.accountNumber)
                && this.ownerName.equals(other.ownerName)
                && Double.compare(this.balance, other.balance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, ownerName, balance);
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


    public static void DisplayAllAccounts() {

        if (accounts.isEmpty()) {
            System.out.println("No accounts available");
            return;
        }

        for (int i = 0; i < accounts.size(); i++) {

            System.out.println(accounts.get(i).displayAccountInfo());

        }
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



