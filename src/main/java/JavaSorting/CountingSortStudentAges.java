/*
 * Problem 7: Counting Sort - Sort Student Ages
 *
 * Problem Statement:
 * A school collects student ages ranging from 10 to 18. Sort the ages in ascending order using Counting Sort. Count the frequency of each possible age and use cumulative frequencies to place ages in their correct output positions.
 *
 * Hint:
 * Create a count array for ages 10 through 18. Validate each input, count occurrences, compute cumulative counts, fill an output array from right to left, and copy it back.
 *
 * Author: Asher Mustafa
 * Date: 12 - 10 - 2026
 */
package JavaSorting;


class CountingSortStudentAges {
    // Sort ages in ascending order using Counting Sort.
    static void countingSort(int[] a) {
        int minAge = 10;
        int maxAge = 18;
        // Allocate one count slot for each permitted age.
        int[] count = new int[maxAge - minAge + 1];
        // Count the frequency of each age.
        for (int age : a) {
            // Reject input outside the problem's age range.
            if (age < minAge || age > maxAge) {
                throw new IllegalArgumentException("Age must be between 10 and 18.");
            }
            count[age - minAge]++;
        }
        // Convert frequencies into cumulative frequencies.
        for (int i = 1; i < count.length; i++) count[i] += count[i - 1];
        int[] output = new int[a.length];
        // Traverse backward to preserve the relative order of equal ages.
        for (int i = a.length - 1; i >= 0; i--) {
            int index = a[i] - minAge;
            output[count[index] - 1] = a[i];
            count[index]--;
        }
        // Copy sorted ages back into the original array.
        for (int i = 0; i < a.length; i++) a[i] = output[i];
    }
    // Display the array.
    static void display(int[] a) {
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }
    // Run the example.
    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 10, 14, 12, 16, 11, 17, 14, 10};
        System.out.print("Before: ");
        display(ages);
        countingSort(ages);
        System.out.print("After:  ");
        display(ages);
    }
}
