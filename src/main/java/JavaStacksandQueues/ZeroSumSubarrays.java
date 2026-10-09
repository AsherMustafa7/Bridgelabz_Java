
/*
 * Problem: Find All Subarrays with Zero Sum
 *
 * Description:
 * Given an integer array, find and display all contiguous subarrays
 * whose elements add up to zero. A subarray must contain consecutive
 * elements from the original array.
 *
 * Hint:
 * Calculate the prefix sum while traversing the array. Store the
 * indices associated with each prefix sum in a HashMap. When the
 * same prefix sum appears again, the elements between the previous
 * occurrence and the current index form a zero-sum subarray.
 *
 * Author: Asher Mustafa
 * Date: 09 - 10 - 2026
 */

package JavaStacksandQueues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ZeroSumSubarrays {

    // Find and return all contiguous zero-sum subarrays.
    static List<List<Integer>> findAll(int[] values) {

        // Store all the zero-sum subarrays found.
        List<List<Integer>> result = new ArrayList<>();

        // Store each prefix sum and the indices where it occurred.
        Map<Integer, List<Integer>> prefixIndices = new HashMap<>();

        // Store the initial prefix sum at the position before index zero.
        List<Integer> initialIndices = new ArrayList<>();
        initialIndices.add(-1);
        prefixIndices.put(0, initialIndices);

        // Track the cumulative sum while traversing the array.
        int prefixSum = 0;

        // Visit every element in the array.
        for (int i = 0; i < values.length; i++) {

            // Add the current element to the cumulative sum.
            prefixSum += values[i];

            // Find previous positions with the same cumulative sum.
            List<Integer> starts = prefixIndices.get(prefixSum);

            // If the sum appeared before, zero-sum subarrays exist.
            if (starts != null) {

                // Process every previous occurrence of this prefix sum.
                for (int startIndex : starts) {

                    // Create a list for the current zero-sum subarray.
                    List<Integer> subarray = new ArrayList<>();

                    // Copy the elements between the previous and current indices.
                    for (int j = startIndex + 1; j <= i; j++) {
                        subarray.add(values[j]);
                    }

                    // Add the discovered subarray to the result.
                    result.add(subarray);
                }
            }

            // Create a list of indices if this prefix sum is new.
            if (!prefixIndices.containsKey(prefixSum)) {
                prefixIndices.put(prefixSum, new ArrayList<>());
            }

            // Record the current index for this prefix sum.
            prefixIndices.get(prefixSum).add(i);
        }

        // Return all discovered zero-sum subarrays.
        return result;
    }

    // Run the program and display the results.
    public static void main(String[] args) {

        // Create a sample integer array.
        int[] values = {2, -2, 3, 1, -1, 2, -3};

        // Find every contiguous subarray whose sum is zero.
        List<List<Integer>> result = findAll(values);

        // Display the array.
        System.out.println("Original Array:");

        // Print all array elements.
        for (int value : values) {
            System.out.print(value + " ");
        }

        // Move to the next line.
        System.out.println();

        // Display all discovered zero-sum subarrays.
        System.out.println("\nZero-Sum Subarrays:");

        // Check whether any matching subarrays were found.
        if (result.isEmpty()) {
            System.out.println("No zero-sum subarrays found.");
        } else {

            // Print every matching subarray.
            for (List<Integer> subarray : result) {
                System.out.println(subarray);
            }
        }
    }
}
