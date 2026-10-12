/*
 * Problem 2: Insertion Sort - Sort Employee IDs
 *
 * Problem Statement:
 * A company stores employee IDs in an unsorted array. Sort the IDs in ascending order by maintaining a sorted section and inserting each next ID into its correct position.
 *
 * Hint:
 * Save the next element as a key. Shift larger elements in the sorted section right, then place the key in the open position.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSorting;


class InsertionSortEmployeeIDs {
    // Sort employee IDs in ascending order.
    static void insertionSort(int[] a) {
        // Start from the second element.
        for (int i = 1; i < a.length; i++) {
            // Save the value that must be inserted.
            int key = a[i];
            int j = i - 1;
            // Shift larger values one position right.
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            // Insert the key into its sorted position.
            a[j + 1] = key;
        }
    }
    // Display the array.
    static void display(int[] a) {
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }
    // Run the example.
    public static void main(String[] args) {
        int[] ids = {1042, 1007, 1031, 1015, 1022, 1003};
        System.out.print("Before: ");
        display(ids);
        insertionSort(ids);
        System.out.print("After:  ");
        display(ids);
    }
}
