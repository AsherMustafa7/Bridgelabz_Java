/*
 * Problem 5: Circular Tour Problem
Given petrol pumps represented by petrol and distance to the next pump, determine the starting pump index from which a full circular tour can be completed. Return -1 if no solution exists.
Track the total petrol surplus and the current tour surplus to identify a valid starting point.
 *
 * Hint:
 * If the current surplus becomes negative, no pump from the current start through this pump can be the answer. Start checking from the next pump.
 *
 * Author: Asher Mustafa
 * Date: 09 - 10 - 2026
 */
package JavaStacksandQueues;

import java.util.Arrays;

// Find a valid starting pump for a circular tour.
class CircularTourProblem {
    // Each row contains petrol available and distance to the next pump.
    static int findStart(int[][] pumps) {
        int totalSurplus = 0;
        int currentSurplus = 0;
        int start = 0;
        for (int i = 0; i < pumps.length; i++) {
            int difference = pumps[i][0] - pumps[i][1];
            totalSurplus += difference;
            currentSurplus += difference;
            if (currentSurplus < 0) {
                start = i + 1;
                currentSurplus = 0;
            }
        }
        return totalSurplus >= 0 && start < pumps.length ? start : -1;
    }

    // Demonstrate a circular tour.
    public static void main(String[] args) {
        int[][] pumps = {{6, 4}, {3, 6}, {7, 3}};
        System.out.println("Pumps: " + Arrays.deepToString(pumps));
        System.out.println("Starting index: " + findStart(pumps));
    }
}