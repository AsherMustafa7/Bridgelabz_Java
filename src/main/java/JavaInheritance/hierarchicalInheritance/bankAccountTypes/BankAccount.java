/*
 * Sample Problem 1: Bank Account Types. Define BankAccount with accountNumber and balance.
 *
 * Hint:
 * Use one superclass with multiple direct subclasses.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hierarchicalInheritance.bankAccountTypes;

class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Initialize common account data.
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Display common account information.
    void displayAccountType() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
