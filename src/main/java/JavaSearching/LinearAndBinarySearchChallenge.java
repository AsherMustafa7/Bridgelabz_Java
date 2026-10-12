/*
 * Challenge: First Missing Positive and Binary Search Target
 *
 * Problem Statement:
 * Find the first missing positive integer using a linear-search-based scan, then sort a copy of the input and use binary search to find a target index in the sorted array.
 *
 * Hint:
 * For the missing positive, mark values within 1 through array length in a boolean array. For the target search, sort the array first and use the standard iterative binary search.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSearching;


import java.util.Arrays;

class LinearAndBinarySearchChallenge {
    // Find the smallest positive integer absent from the input.
    static int firstMissingPositive(int[] a) {
        boolean[] present = new boolean[a.length + 1];
        // Mark positive values that fit in the searchable range.
        for (int value : a) {
            if (value > 0 && value <= a.length) present[value] = true;
        }
        // The first unmarked positive value is missing.
        for (int i = 1; i <= a.length; i++) {
            if (!present[i]) return i;
        }
        return a.length + 1;
    }
    // Find a target index in a sorted array using binary search.
    static int binarySearch(int[] a, int target) {
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == target) return mid;
            if (a[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    // Run the challenge.
    public static void main(String[] args) {
        int[] values = {3, 4, -1, 1, 6, 2};
        System.out.println("First missing positive: " + firstMissingPositive(values));
        int[] sorted = Arrays.copyOf(values, values.length);
        Arrays.sort(sorted);
        int target = 4;
        System.out.println("Sorted array: " + Arrays.toString(sorted));
        System.out.println("Index of " + target + ": " + binarySearch(sorted, target));
    }
}
