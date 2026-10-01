package javaStatics.level1;

/*
 * Question:
 * Create a BankAccount class with the following features:
 * 1. Static:
 *    - A static variable bankName shared across all accounts.
 *    - A static method getTotalAccounts() to display the total number of accounts.
 * 2. This:
 *    - Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
 * 3. Final:
 *    - Use a final variable accountNumber to ensure it cannot be changed once assigned.
 * 4. Instanceof:
 *    - Check if an account object is an instance of the BankAccount class before displaying its details.
 *
 * Author: Asher Mustafa
 * Date: 01 - 10 - 2026
 */

public class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }

    public static void main(String[] args) {
        // Create two BankAccount objects.
        BankAccount account1 = new BankAccount("Asher", 101);
        BankAccount account2 = new BankAccount("John", 102);

        // Check whether account1 is an instance of BankAccount.
        if (account1 instanceof BankAccount) {
            account1.displayDetails();
        }

        // Check whether account2 is an instance of BankAccount.
        if (account2 instanceof BankAccount) {
            account2.displayDetails();
        }

        // Display the total number of accounts.
        BankAccount.getTotalAccounts();
    }
}
