/*
 * Sample Problem 1: Create SavingsAccount with interestRate and displayAccountType().
 *
 * Hint:
 * Extend BankAccount directly.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hierarchicalInheritance.bankAccountTypes;

class SavingsAccount extends BankAccount {
    private double interestRate;

    // Initialize inherited and account-specific data.
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Display common data and account type.
    @Override
    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
