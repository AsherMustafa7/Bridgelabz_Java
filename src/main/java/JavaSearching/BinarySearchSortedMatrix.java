/*
 * Binary Search Problem 3: Search a Sorted 2D Matrix
 *
 * Problem Statement:
 * Search a matrix where every row is sorted and the first value of each row is greater than the last value of the previous row. Return true if the target exists.
 *
 * Hint:
 * Treat the matrix as a flattened sorted array. Convert a flat index to row and column using row = index / numberOfColumns and column = index % numberOfColumns.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSearching;


class BinarySearchSortedMatrix {
    // Search the matrix as if it were a one-dimensional sorted array.
    static boolean contains(int[][] a, int target) {
        if (a.length == 0 || a[0].length == 0) return false;
        int rows = a.length, cols = a[0].length;
        int left = 0, right = rows * cols - 1;
        // Perform binary search over flattened indices.
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = a[mid / cols][mid % cols];
            if (value == target) return true;
            if (value < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
    // Run the example.
    public static void main(String[] args) {
        int[][] a = {{1, 3, 5}, {7, 9, 11}, {13, 15, 17}};
        System.out.println("Contains 9: " + contains(a, 9));
        System.out.println("Contains 8: " + contains(a, 8));
    }
}
