package JavaSorting;
/*
 * Problem 1: Bubble Sort - Sort Student Marks
 *
 * Problem Statement:
 * A school maintains student marks in an array. Sort the marks in ascending order by comparing adjacent elements and swapping those that are out of order.
 *
 * Hint:
 * Repeat passes through the array. After each pass, the largest unsorted mark reaches its final position. Stop early if a pass makes no swaps.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */



class BubbleSortStudentMarks {
    // Sort marks in ascending order.
    static void bubbleSort(int[] a) {
        // Repeat passes until the array is sorted.
        for (int i = 0; i < a.length - 1; i++) {
            // Track whether this pass changes the array.
            boolean swapped = false;
            // Compare adjacent values in the unsorted section.
            for (int j = 0; j < a.length - 1 - i; j++) {
                // Swap adjacent marks when they are out of order.
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            // Stop if no swap was needed.
            if (!swapped) break;
        }
    }
    // Display the array.
    static void display(int[] a) {
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }
    // Run the example.
    public static void main(String[] args) {
        int[] marks = {78, 45, 92, 61, 55, 88, 39};
        System.out.print("Before: ");
        display(marks);
        bubbleSort(marks);
        System.out.print("After:  ");
        display(marks);
    }
}
