
package Bank;

public class Main {

    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {

            for (int s = 0; s < 5 - i; s++) {
                System.out.print(" ");

            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");

            }
            System.out.println("");
        }

//
//        Bank acc1 = new Bank("1001", "Ahmed", 5000);
//
//        Bank.DisplayAllAccounts();

//
//
//        // Create 3 accounts
//        Bank acc1 = new Bank("1001", "Ahmed", 5000);
//        Bank acc2 = new Bank("1002", "Mohamed", 0);
//        Bank acc3 = new Bank("1003", "Ali", 1000);
//
//        // Check total accounts
//        System.out.println("Total accounts: " + Bank.getTotalAccounts());
//
//        // Test 1: Delete account with zero balance
//        System.out.println("\nTest 1:");
//        Bank.DeleteAccount("1002");
//
//        // Test 2: Delete account with money
//        System.out.println("\nTest 2:");
//        Bank.DeleteAccount("1001");
//
//        // Test 3: Delete account that doesn't exist
//        System.out.println("\nTest 3:");
//        Bank.DeleteAccount("9999");
//
//        // Final result
//        System.out.println("\nFinal total accounts: " + Bank.getTotalAccounts());
    }
}
