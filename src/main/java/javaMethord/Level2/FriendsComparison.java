/*
 * Question:
 * Create a program to find the youngest friend among Amar, Akbar, and
 * Anthony based on their ages and the tallest friend based on their heights.
 * Display both results.
 *
 * Hints:
 * 1. Take user input for age and height of the three friends.
 * 2. Store the ages and heights in two arrays.
 * 3. Write a method to find the youngest friend.
 * 4. Write a method to find the tallest friend.
 *
 * Author: Asher Mustafa
 * Date: 24 - 09 - 2026
 */

import java.util.Scanner;

public class FriendsComparison {

    // Find the index of the youngest friend.
    public int findYoungestIndex(int[] ages) {
        int youngestIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        return youngestIndex;
    }

    // Find the index of the tallest friend.
    public int findTallestIndex(double[] heights) {
        int tallestIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        return tallestIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FriendsComparison comparison = new FriendsComparison();

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take age and height for each friend.
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " in cm: ");
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = comparison.findYoungestIndex(ages);
        int tallestIndex = comparison.findTallestIndex(heights);

        // Display the youngest and tallest friends.
        System.out.println("Youngest friend: " + names[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex]);

        sc.close();
    }
}
