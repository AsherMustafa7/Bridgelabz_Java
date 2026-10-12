/*
 * Problem 4: Quick Sort - Sort Product Prices
 *
 * Problem Statement:
 * An e-commerce company stores product prices in an unsorted array. Sort them in ascending order by choosing a pivot, partitioning values around it, and recursively sorting each side.
 *
 * Hint:
 * This solution chooses the last element as pivot. Move values less than or equal to the pivot left, place the pivot in its final position, then sort both partitions.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSorting;


class QuickSortProductPrices {
    // Sort the portion between low and high.
    static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            // Partition and obtain the pivot's final position.
            int p = partition(a, low, high);
            // Sort values before the pivot.
            quickSort(a, low, p - 1);
            // Sort values after the pivot.
            quickSort(a, p + 1, high);
        }
    }
    // Partition around the final element.
    static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        // Move values no greater than the pivot to the left.
        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        // Place the pivot between the two partitions.
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;
        return i + 1;
    }
    // Display the array.
    static void display(int[] a) {
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }
    // Run the example.
    public static void main(String[] args) {
        int[] prices = {2499, 799, 1299, 4999, 1599, 999, 3499};
        System.out.print("Before: ");
        display(prices);
        quickSort(prices, 0, prices.length - 1);
        System.out.print("After:  ");
        display(prices);
    }
}
