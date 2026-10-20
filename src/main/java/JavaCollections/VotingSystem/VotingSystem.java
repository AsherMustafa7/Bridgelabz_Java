
/*
 * Question: Design a Voting System
 * Store candidate vote counts in HashMap, sort results using TreeMap,
 * and maintain candidate insertion order using LinkedHashMap.
 * Hint: Use merge(candidate, 1, Integer::sum) to count votes.
 * Author: Asher Mustafa
 * Date: 20 - 10 - 2026
 */

package JavaCollections.VotingSystem;

import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        // Store sample votes in the order they were cast.
        List<String> votes = Arrays.asList(
                "Alice", "Bob", "Alice",
                "Carol", "Bob", "Alice", "Carol");

        // Store candidate totals using a HashMap.
        Map<String, Integer> hashMap = new HashMap<>();

        // Store totals while preserving candidate insertion order.
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Process each vote.
        for (String candidate : votes) {
            // Increase the candidate's count in the HashMap.
            hashMap.merge(candidate, 1, Integer::sum);

            // Increase the candidate's count in the LinkedHashMap.
            linkedHashMap.merge(candidate, 1, Integer::sum);
        }

        // Copy results into a TreeMap to sort candidates alphabetically.
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

        // Display voting results in each map's order.
        System.out.println("HashMap results: " + hashMap);
        System.out.println("Insertion-order results: " + linkedHashMap);
        System.out.println("Sorted results: " + treeMap);

        // Initialize the winner and the highest vote count.
        String winner = null;
        int highest = -1;

        // Find the candidate with the most votes.
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > highest) {
                highest = entry.getValue();
                winner = entry.getKey();
            }
        }

        // Display the winner.
        System.out.println("Winner: " + winner);
        System.out.println("Votes: " + highest);
    }
}
