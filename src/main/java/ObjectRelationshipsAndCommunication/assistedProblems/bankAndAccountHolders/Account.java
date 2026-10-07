/*
 * Question:
 * Model a relationship where a Bank has Customer objects associated with it.
 * A Customer can have multiple bank accounts, and each account is linked to a Bank.
 *
 * Tasks:
 * Define a Bank class and a Customer class.
 * Use association to show that each Customer has an account in a Bank.
 * Implement openAccount in Bank and viewBalance in Customer.
 *
 * Goal:
 * Illustrate association by setting up a relationship between customers and the bank.
 *
 * Hint:
 * Keep Bank and Customer as separate objects.
 * Let Bank create or connect an Account for a Customer.
 * Let Customer communicate with the Account through viewBalance.
 *
 * Author: Asher Mustafa
 * Date: 04 - 10 - 2026
 */
package ObjectRelationshipsAndCommunication.assistedProblems.bankAndAccountHolders;

class Account {
    // Store the account number.
    private String accountNumber;
    // Store the account balance.
    private double balance;
    // Store the Bank linked with this Account.
    private Bank bank;

    // Create an Account associated with a Bank.
    Account(String accountNumber, Bank bank) {
        // Assign the account number.
        this.accountNumber = accountNumber;
        // Assign the associated Bank.
        this.bank = bank;
        // Start the account with zero balance.
        balance = 0.0;
    }

    // Return the current account balance.
    double getBalance() {
        // Return the stored balance.
        return balance;
    }

    // Return the Bank associated with this Account.
    Bank getBank() {
        // Return the associated Bank.
        return bank;
    }

    // Deposit money into the account.
    void deposit(double amount) {
        // Increase the balance by the deposited amount.
        balance += amount;
    }

    // Return the account number.
    String getAccountNumber() {
        // Return the stored account number.
        return accountNumber;
    }
}
