/*
 * Question: Find the Key with the Highest Value
 * Given a Map<String, Integer>, find the key with the maximum value.
 * Example: {A=10, B=20, C=15} -> B
 * Hint: Traverse the entries and track the largest value and its key.
 * Author: Asher Mustafa
 * Date: 20 - 10 - 2026
 */

package JavaCollections.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class KeyWithHighestValue {
    public static void main(String[] args) {
        // Create a map with sample values.
        Map<String, Integer> map = new HashMap<>();

        // Insert key-value pairs.
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        // Initialize variables to store the highest key and value.
        String key = null;
        Integer max = null;

        // Traverse all entries in the map.
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // Check whether this is the first entry or has a larger value.
            if (max == null || entry.getValue() > max) {
                // Update the maximum value.
                max = entry.getValue();

                // Store the corresponding key.
                key = entry.getKey();
            }
        }

        // Display the result.
        if (key == null) {
            System.out.println("Map is empty.");
        } else {
            System.out.println("Key with highest value: " + key);
            System.out.println("Highest value: " + max);
        }
    }
}