/*
 * Problem 4: Banking System
Create an abstract BankAccount with accountNumber, holderName, and balance.
Provide concrete deposit(double amount) and withdraw(double amount) methods.
Provide abstract calculateInterest().
Create SavingsAccount and CurrentAccount with different interest calculations.
Create a Loanable interface with applyForLoan() and calculateLoanEligibility().
Use encapsulation to protect account details and demonstrate polymorphism by processing different account types.
 *
 * Hint:
 * Keep balance private and change it only through validated methods. Let each account subclass calculate interest in its own way.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaEPIAC;

import java.util.ArrayList;

// Define loan-related behavior.
interface Loanable {
    // Apply for a loan.
    boolean applyForLoan(double amount);

    // Check loan eligibility.
    boolean calculateLoanEligibility(double amount);
}

// Define the common bank account structure.
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Initialize account information.
    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = Math.max(balance, 0);
    }

    // Return the account number.
    public String getAccountNumber() {
        return accountNumber;
    }

    // Return the account holder name.
    public String getHolderName() {
        return holderName;
    }

    // Return the current balance.
    public double getBalance() {
        return balance;
    }

    // Deposit only a positive amount.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw only a valid amount that is available.
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Require subclasses to calculate interest.
    public abstract double calculateInterest();

    // Display account information.
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }
}

// Represent a savings account.
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    // Initialize savings account information.
    SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = Math.max(interestRate, 0);
    }

    // Calculate savings interest.
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    // Check savings loan eligibility.
    @Override
    public boolean calculateLoanEligibility(double amount) {
        return amount > 0 && amount <= getBalance() * 5;
    }

    // Apply for a loan when eligible.
    @Override
    public boolean applyForLoan(double amount) {
        return calculateLoanEligibility(amount);
    }
}

// Represent a current account.
class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate;

    // Initialize current account information.
    CurrentAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = Math.max(interestRate, 0);
    }

    // Calculate current account interest.
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    // Check current account loan eligibility.
    @Override
    public boolean calculateLoanEligibility(double amount) {
        return amount > 0 && amount <= getBalance() * 3;
    }

    // Apply for a loan when eligible.
    @Override
    public boolean applyForLoan(double amount) {
        return calculateLoanEligibility(amount);
    }
}

// Test account processing polymorphically.
class BankingSystem {
    public static void main(String[] args) {
        // Create a list of BankAccount references.
        ArrayList<BankAccount> accounts = new ArrayList<>();

        // Create different account types.
        SavingsAccount savings = new SavingsAccount("SA101", "Asher", 50000, 4.0);
        CurrentAccount current = new CurrentAccount("CA102", "Rahul", 80000, 2.0);

        // Modify balances through validated methods.
        savings.deposit(5000);
        current.withdraw(10000);

        // Store both account types using the common reference type.
        accounts.add(savings);
        accounts.add(current);

        // Process both account types polymorphically.
        for (BankAccount account : accounts) {
            account.displayDetails();

            // Use loan behavior through the interface.
            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                System.out.println("Loan Eligible: " + loanable.calculateLoanEligibility(100000));
            }

            System.out.println();
        }
    }
}
