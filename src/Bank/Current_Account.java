
package Bank;

public class Current_Account extends BankAccount {

    private double overdraftLimit;

    public Current_Account(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
        this.overdraftLimit = overdraftLimit;
    }
}
