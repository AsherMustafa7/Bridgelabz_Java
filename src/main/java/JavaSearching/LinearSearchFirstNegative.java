/*
 * Linear Search Problem 1: Find the First Negative Number
 *
 * Problem Statement:
 * Search an integer array from left to right for the first negative number. Return its index, or -1 if no negative number exists.
 *
 * Hint:
 * Check each element in order and return immediately when a negative value is found.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSearching;


class LinearSearchFirstNegative {
    // Return the index of the first negative value.
    static int findFirstNegative(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) return i;
        }
        return -1;
    }
    // Run the example.
    public static void main(String[] args) {
        int[] a = {8, 4, 0, -6, 3, -2};
        System.out.println("First negative index: " + findFirstNegative(a));
    }
}
