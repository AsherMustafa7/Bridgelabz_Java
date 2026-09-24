/*
 * Question:
 * Write a program that generates five 4 digit random values and then finds
 * their average value, minimum value, and maximum value.
 * Use Math.random, Math.min, and Math.max.
 *
 * Hints:
 * 1. Write a method that generates an array of 4 digit random numbers
 *    given the size as a parameter.
 * 2. Write a method to find the average, minimum, and maximum value of an array.
 *
 * Author: Asher Mustafa
 * Date: 24 - 09 - 2026
 */

public class RandomNumberStatistics {

    // Generate an array of 4 digit random numbers.
    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    // Find and return average, minimum, and maximum values.
    public double[] findAverageMinMax(int[] numbers) {
        int minimum = numbers[0];
        int maximum = numbers[0];
        double sum = 0;

        for (int number : numbers) {
            sum += number;
            minimum = Math.min(minimum, number);
            maximum = Math.max(maximum, number);
        }

        double average = sum / numbers.length;

        return new double[] {average, minimum, maximum};
    }

    public static void main(String[] args) {
        RandomNumberStatistics statistics = new RandomNumberStatistics();

        // Generate five 4 digit random numbers.
        int[] numbers = statistics.generate4DigitRandomArray(5);

        // Display the generated numbers.
        System.out.print("Generated numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        double[] results = statistics.findAverageMinMax(numbers);

        // Display average, minimum, and maximum.
        System.out.println();
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
