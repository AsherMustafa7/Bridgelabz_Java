
/*
 * Question: Insurance Policy Management System using Sets
 * Store policies using HashSet, LinkedHashSet, and TreeSet.
 * Display unique policies, upcoming expiries, and coverage matches.
 * Detect duplicate policy numbers and compare set operation timings.
 * Hint: Use policy number for equals and hashCode. Sort TreeSet by
 * expiry date and then policy number.
 * Author: Asher Mustafa
 * Date: 20 - 10 - 2026
 */

package JavaCollections.InsurancePolicySetSystem;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicySetSystem {

    // Store the details of an insurance policy.
    static class Policy {
        String number;
        String holder;
        LocalDate expiry;
        String coverage;
        double premium;

        // Initialize the policy attributes.
        Policy(String number, String holder, LocalDate expiry,
               String coverage, double premium) {
            this.number = number;
            this.holder = holder;
            this.expiry = expiry;
            this.coverage = coverage;
            this.premium = premium;
        }

        // Policies with the same policy number are considered equal.
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (!(obj instanceof Policy)) {
                return false;
            }

            Policy p = (Policy) obj;
            return Objects.equals(number, p.number);
        }

        // Generate a hash code using the policy number.
        @Override
        public int hashCode() {
            return Objects.hash(number);
        }

        // Display all policy details.
        @Override
        public String toString() {
            return number + " | " + holder + " | " + expiry
                    + " | " + coverage + " | " + premium;
        }
    }

    public static void main(String[] args) {
        // Get today's date.
        LocalDate today = LocalDate.now();

        // Create sample policies.
        Policy p1 = new Policy("P101", "Alice",
                today.plusDays(10), "Health", 12000);

        Policy p2 = new Policy("P102", "Bob",
                today.plusDays(45), "Auto", 8000);

        Policy p3 = new Policy("P103", "Carol",
                today.plusDays(20), "Home", 9500);

        // This policy deliberately repeats P101.
        Policy p4 = new Policy("P101", "Alice",
                today.plusDays(15), "Health", 12000);

        // HashSet stores unique policies without guaranteed ordering.
        Set<Policy> hashSet = new HashSet<>();

        // LinkedHashSet preserves insertion order.
        Set<Policy> linkedHashSet = new LinkedHashSet<>();

        // TreeSet sorts policies by expiry and then policy number.
        Set<Policy> treeSet = new TreeSet<>(
                Comparator.comparing((Policy p) -> p.expiry)
                          .thenComparing(p -> p.number)
        );

        // Store every attempted policy in a list for duplicate detection.
        List<Policy> policies = Arrays.asList(p1, p2, p3, p4);

        // Track policy numbers already encountered.
        Set<String> seen = new HashSet<>();

        // Insert policies into all three sets.
        for (Policy p : policies) {
            // Report a duplicate policy number.
            if (!seen.add(p.number)) {
                System.out.println(
                        "Duplicate policy number: " + p.number);
            }

            // Add the policy to each set.
            hashSet.add(p);
            linkedHashSet.add(p);
            treeSet.add(p);
        }

        // Display policies stored in each set.
        System.out.println("\nHashSet: " + hashSet);
        System.out.println("\nLinkedHashSet: " + linkedHashSet);
        System.out.println("\nTreeSet by expiry: " + treeSet);

        // Display policies expiring today or within the next 30 days.
        System.out.println("\nPolicies expiring within 30 days:");
        for (Policy p : hashSet) {
            if (!p.expiry.isBefore(today)
                    && !p.expiry.isAfter(today.plusDays(30))) {
                System.out.println(p);
            }
        }

        // Read a coverage type from the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter coverage type: ");
        String coverage = sc.nextLine();

        // Display policies matching the requested coverage.
        for (Policy p : hashSet) {
            if (p.coverage.equalsIgnoreCase(coverage)) {
                System.out.println(p);
            }
        }

        // Compare basic timings for the three set implementations.
        timeSet("HashSet", hashSet, p2);
        timeSet("LinkedHashSet", linkedHashSet, p2);
        timeSet("TreeSet", treeSet, p2);

        sc.close();
    }

    // Measure a single add, search, and remove operation.
    static void timeSet(String name, Set<Policy> set, Policy p) {
        long start = System.nanoTime();
        set.add(p);
        long addTime = System.nanoTime() - start;

        start = System.nanoTime();
        set.contains(p);
        long searchTime = System.nanoTime() - start;

        start = System.nanoTime();
        set.remove(p);
        long removeTime = System.nanoTime() - start;

        // Print the measured times in nanoseconds.
        System.out.println(name + " timings: Add=" + addTime
                + ", Search=" + searchTime
                + ", Remove=" + removeTime);

        // Restore the policy removed during the timing demonstration.
        set.add(p);
    }
}
