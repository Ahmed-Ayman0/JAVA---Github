package Bank;

public class Savings_Account extends BankAccount {

    private double interestRate;

    public Savings_Account(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        super.deposit(amount);

        if (!Double.isFinite(interestRate) || interestRate < 0) {
            throw new IllegalArgumentException("Amount must be a positive number");
        }


    }


    public void displaySavingsInfo() {
        displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate);
    }


    public void getinterestRate(double interestRate) {
        this.interestRate = interestRate;

    }

}
