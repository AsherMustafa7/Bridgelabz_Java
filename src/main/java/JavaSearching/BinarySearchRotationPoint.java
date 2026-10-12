/*
 * Binary Search Problem 1: Find the Rotation Point
 *
 * Problem Statement:
 * Given a rotated sorted array with distinct values, find the index of its smallest element, which is the rotation point.
 *
 * Hint:
 * Compare the middle value with the rightmost value. If the middle is larger, search to the right; otherwise, keep the middle in the search range.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSearching;


class BinarySearchRotationPoint {
    // Return the index of the smallest element in a rotated sorted array.
    static int findRotationPoint(int[] a) {
        if (a.length == 0) return -1;
        int left = 0, right = a.length - 1;
        // Narrow the search range until one index remains.
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (a[mid] > a[right]) left = mid + 1;
            else right = mid;
        }
        return left;
    }
    // Run the example.
    public static void main(String[] args) {
        int[] a = {15, 18, 2, 3, 6, 12};
        int index = findRotationPoint(a);
        System.out.println("Rotation point index: " + index);
        if (index >= 0) System.out.println("Smallest value: " + a[index]);
    }
}
