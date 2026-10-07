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
import java.util.ArrayList;

class Customer {
    // Store the name of the Customer.
    private String name;
    // Store all accounts belonging to the Customer.
    private ArrayList<Account> accounts;

    // Create a Customer with the given name.
    Customer(String name) {
        // Assign the given name to the Customer.
        this.name = name;
        // Create the list of Customer accounts.
        accounts = new ArrayList<>();
    }

    // Add an Account to the Customer.
    void addAccount(Account account) {
        // Add the Account to the Customer account list.
        accounts.add(account);
    }

    // Display the balance of every Customer account.
    void viewBalance() {
        // Display the Customer name.
        System.out.println("Customer: " + name);
        // Visit every Account belonging to the Customer.
        for (Account account : accounts) {
            // Display the Bank and balance for the current Account.
            System.out.println(account.getBank().getName() + " Balance: " + account.getBalance());
        }
    }
}
