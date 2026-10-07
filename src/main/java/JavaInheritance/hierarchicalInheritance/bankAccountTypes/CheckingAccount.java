/*
 * Sample Problem 1: Create CheckingAccount with withdrawalLimit and displayAccountType().
 *
 * Hint:
 * Extend BankAccount directly.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hierarchicalInheritance.bankAccountTypes;

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    // Initialize inherited and account-specific data.
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Display common data and account type.
    @Override
    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}
