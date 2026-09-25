/*
Question:
1. Create a program to find the shortest, tallest, and mean height of players present in a football team.

Hints:
1. The formula to calculate the mean is mean = sum of all elements divided by number of elements.
2. Create an int array named heights of size 11 and get 3 digit random height in cms for each player in the range 150 cms to 250 cms.
3. Write a method to find the sum of all elements present in the array.
4. Write a method to find the mean height.
5. Write a method to find the shortest height.
6. Write a method to find the tallest height.
7. Finally display the results.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

public class FootballTeamStatistics {

    // Generate random heights for all football players.
    public int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }

    // Find the sum of all heights.
    public int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Find the mean height.
    public double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Find the shortest height.
    public int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Find the tallest height.
    public int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Create the scanner object using the requested name.
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Create the class object for calling methods.
        FootballTeamStatistics statistics = new FootballTeamStatistics();

        // Store the number of players as a variable.
        int playerCount = 11;

        // Generate the heights array.
        int[] heights = statistics.generateHeights(playerCount);

        // Display every generated height.
        System.out.println("Football Player Heights");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }

        // Find and display the sum.
        int sum = statistics.findSum(heights);
        System.out.println("Sum: " + sum + " cm");

        // Find and display the mean.
        double mean = statistics.findMean(heights);
        System.out.printf("Mean: %.2f cm%n", mean);

        // Find and display the shortest height.
        System.out.println("Shortest: " + statistics.findShortest(heights) + " cm");

        // Find and display the tallest height.
        System.out.println("Tallest: " + statistics.findTallest(heights) + " cm");

        // Close the scanner object.
        sc.close();
    }
}
