package JavaConstructor.Extras;

/*
 * Question:
 * Bank Account Management: Create BankAccount with accountNumber public, accountHolder protected, and balance private. Access and modify balance using public methods. Create SavingsAccount to demonstrate public and protected access.
 *
 * Hint:
 * Use getter/setter for private balance. Create SavingsAccount as a subclass and access accountNumber and accountHolder.
 *
 * Author: Asher Mustafa
 * Date: 30 - 09 - 2026
 */

public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(1001, "Asher", 50000.0);
        account.displayDetails();
        account.setBalance(65000.0);
        account.displayDetails();
        account.displayInheritedMembers();
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayInheritedMembers() {
        System.out.println("Public Account Number: " + accountNumber);
        System.out.println("Protected Account Holder: " + accountHolder);
    }
}
