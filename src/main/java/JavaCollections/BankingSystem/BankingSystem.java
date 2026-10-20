
/*
 * Question: Implement a Banking System
 * Use HashMap for account balances, TreeMap to sort accounts by balance,
 * and Queue to process withdrawal requests in first-in-first-out order.
 * Hint: Store account numbers in the HashMap. Use a queue of withdrawal
 * requests and group accounts by balance in the TreeMap.
 * Author: Asher Mustafa
 * Date: 20 - 10 - 2026
 */

package JavaCollections.BankingSystem;

import java.util.*;

public class BankingSystem {

    // Represent one withdrawal request.
    static class WithdrawalRequest {
        String accountNumber;
        double amount;

        // Initialize the account number and withdrawal amount.
        WithdrawalRequest(String accountNumber, double amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
        }

        // Display the withdrawal request.
        @Override
        public String toString() {
            return accountNumber + " requests " + amount;
        }
    }

    public static void main(String[] args) {
        // Store account numbers and balances in a HashMap.
        Map<String, Double> accounts = new HashMap<>();
        accounts.put("A100", 5000.0);
        accounts.put("A200", 3200.0);
        accounts.put("A300", 7800.0);

        // Store withdrawal requests in a Queue.
        Queue<WithdrawalRequest> requests = new LinkedList<>();

        // Add withdrawal requests in processing order.
        requests.add(new WithdrawalRequest("A100", 1000.0));
        requests.add(new WithdrawalRequest("A200", 4000.0));
        requests.add(new WithdrawalRequest("A300", 2500.0));

        // Process requests until the queue becomes empty.
        while (!requests.isEmpty()) {
            // Remove and retrieve the oldest request.
            WithdrawalRequest request = requests.poll();

            // Find the account balance.
            Double balance = accounts.get(request.accountNumber);

            // Check whether the requested account exists.
            if (balance == null) {
                System.out.println(
                        "Account not found: " + request.accountNumber);
            } else if (request.amount <= 0) {
                // Reject zero or negative withdrawal amounts.
                System.out.println(
                        "Invalid withdrawal amount: " + request.accountNumber);
            } else if (balance < request.amount) {
                // Reject withdrawals greater than the available balance.
                System.out.println(
                        "Insufficient funds: " + request.accountNumber);
            } else {
                // Deduct the withdrawal from the account balance.
                accounts.put(
                        request.accountNumber, balance - request.amount);

                // Confirm the successful withdrawal.
                System.out.println("Withdrawal successful: " + request);
            }
        }

        // Group account numbers by balance in ascending balance order.
        Map<Double, List<String>> sortedBalances = new TreeMap<>();

        // Visit each account and its updated balance.
        for (Map.Entry<String, Double> entry : accounts.entrySet()) {
            // Create a list for the balance if it does not exist.
            sortedBalances.computeIfAbsent(
                    entry.getValue(), key -> new ArrayList<>());

            // Add the account number to the matching balance group.
            sortedBalances.get(entry.getValue()).add(entry.getKey());
        }

        // Display the updated account balances.
        System.out.println("\nUpdated accounts: " + accounts);

        // Display accounts sorted by balance.
        System.out.println(
                "Accounts sorted by balance: " + sortedBalances);
    }
}
