
/*
 * Question: Invert a Map
 * Invert a Map<K, V> to produce a Map<V, List<K>>.
 * Handle duplicate values by storing their keys in a list.
 * Example: {A=1, B=2, C=1} -> {1=[A, C], 2=[B]}
 * Hint: Use computeIfAbsent to create a list for each value.
 * Author: Asher Mustafa
 * Date: 20 - 10 - 2026
 */

package JavaCollections.MapInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMap {
    public static void main(String[] args) {
        // Create the original map.
        Map<String, Integer> map = new HashMap<>();

        // Insert sample key-value pairs.
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        // Create a map where values become keys and original keys become list elements.
        Map<Integer, List<String>> inverted = new HashMap<>();

        // Traverse every entry in the original map.
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // Create a list for the value if it does not already exist.
            inverted.computeIfAbsent(entry.getValue(), k -> new ArrayList<>());

            // Add the original key to the corresponding list.
            inverted.get(entry.getValue()).add(entry.getKey());
        }

        // Display the original map.
        System.out.println("Original Map: " + map);

        // Display the inverted map.
        System.out.println("Inverted Map: " + inverted);
    }
}