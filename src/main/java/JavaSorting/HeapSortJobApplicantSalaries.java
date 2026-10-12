/*
 * Problem 6: Heap Sort - Sort Job Applicant Salaries
 *
 * Problem Statement:
 * A company stores applicants' expected salaries in an array. Sort them in ascending order using Heap Sort: build a Max Heap, move its largest value to the end, and restore the heap repeatedly.
 *
 * Hint:
 * A Max Heap keeps its largest value at the root. Build the heap from the last non-leaf node, swap the root with the last unsorted element, and heapify the reduced heap.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSorting;


class HeapSortJobApplicantSalaries {
    // Sort salaries in ascending order using Heap Sort.
    static void heapSort(int[] a) {
        int n = a.length;
        // Build a Max Heap from the array.
        for (int i = n / 2 - 1; i >= 0; i--) heapify(a, n, i);
        // Move the maximum to the end of the unsorted section.
        for (int i = n - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            // Restore the heap in the remaining section.
            heapify(a, i, 0);
        }
    }
    // Restore the Max Heap property at root.
    static void heapify(int[] a, int size, int root) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;
        // Compare the left child with the largest value.
        if (left < size && a[left] > a[largest]) largest = left;
        // Compare the right child with the largest value.
        if (right < size && a[right] > a[largest]) largest = right;
        // Swap and continue if a child is larger than the root.
        if (largest != root) {
            int temp = a[root];
            a[root] = a[largest];
            a[largest] = temp;
            heapify(a, size, largest);
        }
    }
    // Display the array.
    static void display(int[] a) {
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }
    // Run the example.
    public static void main(String[] args) {
        int[] salaries = {65000, 45000, 80000, 55000, 72000, 40000};
        System.out.print("Before: ");
        display(salaries);
        heapSort(salaries);
        System.out.print("After:  ");
        display(salaries);
    }
}
