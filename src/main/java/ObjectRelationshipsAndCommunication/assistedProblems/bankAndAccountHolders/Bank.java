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
class Bank {
    // Store the name of the Bank.
    private String name;

    // Create a Bank with the given name.
    Bank(String name) {
        // Assign the given name to the Bank.
        this.name = name;
    }

    // Open an Account for the given Customer.
    Account openAccount(Customer customer, String accountNumber) {
        // Create an Account associated with this Bank.
        Account account = new Account(accountNumber, this);
        // Associate the new Account with the Customer.
        customer.addAccount(account);
        // Return the newly created Account.
        return account;
    }

    // Return the name of the Bank.
    String getName() {
        // Return the stored bank name.
        return name;
    }
}
