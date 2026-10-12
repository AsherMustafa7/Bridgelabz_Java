/*
 * Problem 3: Merge Sort - Sort Book Prices
 *
 * Problem Statement:
 * A bookstore stores book prices in an array. Sort the prices in ascending order by recursively dividing the array, sorting each half, and merging the sorted halves.
 *
 * Hint:
 * Find the middle index, sort both halves recursively, and merge by repeatedly choosing the smaller available value. Copy any remaining values.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSorting;


class MergeSortBookPrices {
    // Sort the selected portion of the array.
    static void mergeSort(int[] a, int left, int right) {
        // Divide while the section contains multiple values.
        if (left < right) {
            int mid = left + (right - left) / 2;
            // Sort the left half.
            mergeSort(a, left, mid);
            // Sort the right half.
            mergeSort(a, mid + 1, right);
            // Merge the sorted halves.
            merge(a, left, mid, right);
        }
    }
    // Merge two sorted portions.
    static void merge(int[] a, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] l = new int[n1];
        int[] r = new int[n2];
        // Copy values into temporary arrays.
        for (int i = 0; i < n1; i++) l[i] = a[left + i];
        for (int j = 0; j < n2; j++) r[j] = a[mid + 1 + j];
        int i = 0, j = 0, k = left;
        // Select the smaller front value from either half.
        while (i < n1 && j < n2) {
            if (l[i] <= r[j]) a[k++] = l[i++];
            else a[k++] = r[j++];
        }
        // Copy any remaining left-half values.
        while (i < n1) a[k++] = l[i++];
        // Copy any remaining right-half values.
        while (j < n2) a[k++] = r[j++];
    }
    // Display the array.
    static void display(int[] a) {
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }
    // Run the example.
    public static void main(String[] args) {
        int[] prices = {450, 199, 725, 320, 150, 560, 275};
        System.out.print("Before: ");
        display(prices);
        mergeSort(prices, 0, prices.length - 1);
        System.out.print("After:  ");
        display(prices);
    }
}
