/*
 * Sample Problem 1: Create FixedDepositAccount with depositTerm and displayAccountType().
 *
 * Hint:
 * Extend BankAccount directly.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hierarchicalInheritance.bankAccountTypes;

class FixedDepositAccount extends BankAccount {
    private int depositTerm;

    // Initialize inherited and account-specific data.
    FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    // Display common data and account type.
    @Override
    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}
