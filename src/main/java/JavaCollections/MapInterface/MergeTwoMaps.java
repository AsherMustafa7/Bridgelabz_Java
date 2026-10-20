/*
 * Question: Merge Two Maps
 * Merge two maps and sum their values when a key exists in both maps.
 * Example: {A=1, B=2} and {B=3, C=4} -> {A=1, B=5, C=4}
 * Hint: Copy the first map and use merge() to combine the second map.
 * Author: Asher Mustafa
 * Date: 20 - 10 - 2026
 */

package JavaCollections.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
    public static void main(String[] args) {
        // Create the first map.
        Map<String, Integer> map1 = new HashMap<>();

        // Insert values into the first map.
        map1.put("A", 1);
        map1.put("B", 2);

        // Create the second map.
        Map<String, Integer> map2 = new HashMap<>();

        // Insert values into the second map.
        map2.put("B", 3);
        map2.put("C", 4);

        // Copy the first map into a new map.
        Map<String, Integer> merged = new HashMap<>(map1);

        // Traverse the second map.
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            // Add new keys or sum values when the key already exists.
            merged.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        // Display both original maps.
        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);

        // Display the merged result.
        System.out.println("Merged Map: " + merged);
    }
}