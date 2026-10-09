/*
 * Problem 5: Two Sum Problem
Given an integer array and a target sum, return the indices of two different elements whose values add up to the target. Return an empty array if no solution exists.
Use a hash map from each visited value to its index and check whether the complement has already been seen.
 *
 * Hint:
 * At each index, look up target minus the current value before saving the current value and index.
 *
 * Author: Asher Mustafa
 * Date: 09 - 10 - 2026
 */
package JavaStacksandQueues;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

// Return indices of two values that add up to a target.
class TwoSum {
    // Return an empty array when no pair is found.
    static int[] findIndices(int[] values, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < values.length; i++) {
            int complement = target - values[i];
            if (indices.containsKey(complement)) {
                return new int[] {indices.get(complement), i};
            }
            indices.put(values[i], i);
        }
        return new int[0];
    }

    // Demonstrate the result.
    public static void main(String[] args) {
        int[] values = {2, 7, 11, 15};
        System.out.println(Arrays.toString(findIndices(values, 9)));
    }
}