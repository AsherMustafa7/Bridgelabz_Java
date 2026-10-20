
/*
 * Question: Insurance Policy Management System using Maps
 * Use HashMap, LinkedHashMap, and TreeMap to store policies.
 * Retrieve policies by number and policyholder, find upcoming expiries,
 * and remove expired policies.
 * Hint: Use policy numbers as keys in HashMap and LinkedHashMap.
 * Use expiry dates as TreeMap keys and lists as their values.
 * Author: Asher Mustafa
 * Date: 20 - 10 - 2026
 */

package JavaCollections.InsurancePolicyMapSystem;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyMapSystem {

    // Store the attributes of a policy.
    static class Policy {
        String number;
        String holder;
        LocalDate expiry;
        String coverage;
        double premium;

        // Initialize policy details.
        Policy(String number, String holder, LocalDate expiry,
               String coverage, double premium) {
            this.number = number;
            this.holder = holder;
            this.expiry = expiry;
            this.coverage = coverage;
            this.premium = premium;
        }

        // Display policy information.
        @Override
        public String toString() {
            return number + " | " + holder + " | " + expiry
                    + " | " + coverage + " | " + premium;
        }
    }

    public static void main(String[] args) {
        // Get today's date.
        LocalDate today = LocalDate.now();

        // Store policies for quick retrieval by policy number.
        Map<String, Policy> hashMap = new HashMap<>();

        // Store policies in insertion order.
        Map<String, Policy> linkedHashMap = new LinkedHashMap<>();

        // Store policies in expiry-date order.
        Map<LocalDate, List<Policy>> treeMap = new TreeMap<>();

        // Create sample policies.
        List<Policy> policies = Arrays.asList(
                new Policy("P201", "Alice",
                        today.plusDays(10), "Health", 12000),
                new Policy("P202", "Bob",
                        today.plusDays(40), "Auto", 8000),
                new Policy("P203", "Alice",
                        today.minusDays(5), "Home", 9500),
                new Policy("P204", "Carol",
                        today.plusDays(25), "Health", 11000)
        );

        // Insert each policy into all three maps.
        for (Policy p : policies) {
            hashMap.put(p.number, p);
            linkedHashMap.put(p.number, p);

            // Create an expiry-date list when necessary.
            treeMap.computeIfAbsent(
                    p.expiry, date -> new ArrayList<>());

            // Add the policy to its expiry-date group.
            treeMap.get(p.expiry).add(p);
        }

        // Display the three map structures.
        System.out.println("HashMap: " + hashMap);
        System.out.println("\nLinkedHashMap: " + linkedHashMap);
        System.out.println("\nTreeMap by expiry date: " + treeMap);

        // Read a policy number and retrieve that policy.
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter policy number: ");
        String number = sc.nextLine();

        // Find the requested policy.
        Policy found = hashMap.get(number);

        // Display the policy or a not-found message.
        if (found == null) {
            System.out.println("Policy not found.");
        } else {
            System.out.println(found);
        }

        // Display policies expiring within 30 days.
        System.out.println("\nPolicies expiring within 30 days:");
        for (Policy p : hashMap.values()) {
            if (!p.expiry.isBefore(today)
                    && !p.expiry.isAfter(today.plusDays(30))) {
                System.out.println(p);
            }
        }

        // Read a policyholder name.
        System.out.print("\nEnter policyholder name: ");
        String holder = sc.nextLine();

        // Display all policies belonging to that policyholder.
        for (Policy p : hashMap.values()) {
            if (p.holder.equalsIgnoreCase(holder)) {
                System.out.println(p);
            }
        }

        // Remove policies that expired before today from the first map.
        hashMap.values().removeIf(
                p -> p.expiry.isBefore(today));

        // Remove expired policies from the insertion-order map.
        linkedHashMap.values().removeIf(
                p -> p.expiry.isBefore(today));

        // Remove expired policies from each expiry-date list.
        treeMap.entrySet().removeIf(entry -> {
            entry.getValue().removeIf(
                    p -> p.expiry.isBefore(today));

            // Remove date entries that no longer contain policies.
            return entry.getValue().isEmpty();
        });

        // Display the maps after removing expired policies.
        System.out.println("\nHashMap after removal: " + hashMap);
        System.out.println("LinkedHashMap after removal: "
                + linkedHashMap);
        System.out.println("TreeMap after removal: " + treeMap);

        sc.close();
    }
}
