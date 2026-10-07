/*
 * Sample Problem 1: Demonstrate hierarchical inheritance with different account types.
 *
 * Hint:
 * Use BankAccount references for the subclasses.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hierarchicalInheritance.bankAccountTypes;

class BankAccountTest {
    public static void main(String[] args) {
        // Store different account types in BankAccount references.
        BankAccount savings = new SavingsAccount("SA101", 50000, 4.5);
        BankAccount checking = new CheckingAccount("CA102", 30000, 10000);
        BankAccount fixed = new FixedDepositAccount("FD103", 100000, 24);

        // Call the overridden method polymorphically.
        savings.displayAccountType();
        System.out.println();
        checking.displayAccountType();
        System.out.println();
        fixed.displayAccountType();
    }
}
