/*
 * Problem 3: Longest Consecutive Sequence
Given an unsorted integer array, find the length of the longest sequence of consecutive values. The values do not need to appear next to each other in the array.
Use a hash set and only begin counting from values that have no predecessor.
 *
 * Hint:
 * For each value x, start a sequence only if x - 1 is absent, then count x, x + 1, and so on.
 *
 * Author: Asher Mustafa
 * Date: 09 - 10 - 2026
 */
package JavaStacksandQueues;
import java.util.HashSet;
import java.util.Set;

// Find the length of the longest consecutive-value sequence.
class LongestConsecutiveSequence {
    // Compute the answer in expected O(n) time.
    static int findLength(int[] values) {
        Set<Integer> set = new HashSet<>();
        for (int value : values) {
            set.add(value);
        }
        int longest = 0;
        for (int value : set) {
            if (!set.contains(value - 1)) {
                int current = value;
                int length = 1;
                while (current != Integer.MAX_VALUE && set.contains(current + 1)) {
                    current++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }

    // Demonstrate the algorithm.
    public static void main(String[] args) {
        int[] values = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest sequence length: " + findLength(values));
    }
}