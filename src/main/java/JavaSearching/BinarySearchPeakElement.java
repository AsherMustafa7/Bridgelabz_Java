/*
 * Binary Search Problem 2: Find a Peak Element
 *
 * Problem Statement:
 * Find any peak element in an integer array. A peak is greater than its neighboring elements; an endpoint needs to be greater only than its single neighbor.
 *
 * Hint:
 * Compare the middle element with the next element. If the sequence rises, a peak exists to the right; otherwise, a peak exists at or to the left.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSearching;


class BinarySearchPeakElement {
    // Return the index of a peak element.
    static int findPeak(int[] a) {
        if (a.length == 0) return -1;
        int left = 0, right = a.length - 1;
        // Keep the half that is guaranteed to contain a peak.
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (a[mid] < a[mid + 1]) left = mid + 1;
            else right = mid;
        }
        return left;
    }
    // Run the example.
    public static void main(String[] args) {
        int[] a = {1, 3, 8, 6, 4, 5, 2};
        int index = findPeak(a);
        System.out.println("Peak index: " + index);
        if (index >= 0) System.out.println("Peak value: " + a[index]);
    }
}
