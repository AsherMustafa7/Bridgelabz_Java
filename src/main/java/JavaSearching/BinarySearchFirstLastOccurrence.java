/*
 * Binary Search Problem 4: First and Last Occurrence
 *
 * Problem Statement:
 * Given a sorted array and a target value, find the first and last indices where the target appears. Return [-1, -1] if it does not appear.
 *
 * Hint:
 * Run binary search twice. When the target is found, record the index and continue left for the first occurrence or right for the last occurrence.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSearching;


import java.util.Arrays;

class BinarySearchFirstLastOccurrence {
    // Find the first occurrence of the target.
    static int firstOccurrence(int[] a, int target) {
        int left = 0, right = a.length - 1, answer = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == target) {
                answer = mid;
                right = mid - 1;
            } else if (a[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return answer;
    }
    // Find the last occurrence of the target.
    static int lastOccurrence(int[] a, int target) {
        int left = 0, right = a.length - 1, answer = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == target) {
                answer = mid;
                left = mid + 1;
            } else if (a[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return answer;
    }
    // Run the example.
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 3, 4, 4, 5};
        int target = 2;
        System.out.println(Arrays.toString(new int[]{
            firstOccurrence(a, target), lastOccurrence(a, target)
        }));
    }
}
