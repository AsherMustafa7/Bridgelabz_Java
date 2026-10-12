/*
 * Problem 5: Selection Sort - Sort Exam Scores
 *
 * Problem Statement:
 * A university stores exam scores in an unsorted array. Sort the scores in ascending order by finding the minimum value in each unsorted section and swapping it into the first unsorted position.
 *
 * Hint:
 * At each position, search the rest of the array for the smallest value. Swap that value with the current position and repeat.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSorting;


class SelectionSortExamScores {
    // Sort exam scores in ascending order.
    static void selectionSort(int[] a) {
        // Select the next position to fill.
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            // Find the minimum in the remaining unsorted section.
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) min = j;
            }
            // Swap only if the minimum is in another position.
            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }
    // Display the array.
    static void display(int[] a) {
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }
    // Run the example.
    public static void main(String[] args) {
        int[] scores = {84, 67, 91, 73, 58, 96, 70};
        System.out.print("Before: ");
        display(scores);
        selectionSort(scores);
        System.out.print("After:  ");
        display(scores);
    }
}
