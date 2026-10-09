/*
 * Problem 2: Check for a Pair with Given Sum
Given an integer array and a target sum, determine whether two different array elements add up to the target.
Use a hash set to remember values already visited and look for target minus the current value.
 *
 * Hint:
 * For each value, check whether its complement has already been seen before adding the current value to the set.
 *
 * Author: Asher Mustafa
 * Date: 09 - 10 - 2026
 */
package JavaStacksandQueues;
import java.util.HashSet;
import java.util.Set;

// Check whether any two distinct array positions form the target sum.
class PairWithGivenSum {
    // Return true when a matching pair exists.
    static boolean hasPair(int[] values, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int value : values) {
            if (seen.contains(target - value)) {
                return true;
            }
            seen.add(value);
        }
        return false;
    }

    // Test a sample input.
    public static void main(String[] args) {
        int[] values = {8, 7, 2, 5, 3, 1};
        int target = 10;
        System.out.println("Pair exists: " + hasPair(values, target));
    }
}