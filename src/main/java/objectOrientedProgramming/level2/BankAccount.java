/*
 * Question:
 * Create a BankAccount class with attributes accountHolder,
 * accountNumber, and balance.
 * Add methods for depositing money, withdrawing money only when
 * sufficient balance exists, and displaying the current balance.
 *
 * Hint:
 * Use private attributes, a constructor, getter and setter methods,
 * and separate methods for deposit, withdrawal, and balance display.
 *
 * Author: Asher Mustafa
 * Date: 29 - 09 - 2026
 */

public class BankAccount {

    // Store the account holder name
    private String accountHolder;

    // Store the account number
    private long accountNumber;

    // Store the current account balance
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter to return the account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter to update the account holder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter to return the account number
    public long getAccountNumber() {
        return accountNumber;
    }

    // Setter to update the account number
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter to return the balance
    public double getBalance() {
        return balance;
    }

    // Setter to update the balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw money when sufficient balance exists
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Display the current account balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("Asher", 1234567890L, 10000);

        // Deposit money
        account.deposit(2000);

        // Withdraw money
        account.withdraw(1500);

        // Display the current balance
        account.displayBalance();
    }
}
