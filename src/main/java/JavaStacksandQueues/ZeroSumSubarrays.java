
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
    static List<List<Integer>> findAll(int[] arr) {// Store all the zero-sum subarrays found.
         HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        int sum = 0;

        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {

                    List<Integer> subarray = new ArrayList<>();

                    for (int j = start + 1; j <= i; j++) {
                        subarray.add(arr[j]);
                    }

                    result.add(subarray);
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

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
