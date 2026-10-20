package Java8Assignments.NumberPlay;

import java.util.*;
import java.util.stream.*;

public class NumberPlay {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                10, 5, 20, 15, 30, 5, 40, 25
        );

        // 1. Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);

        // 2. Filter numbers greater than 15
        List<Integer> greaterThan15 = numbers.stream()
                .filter(n -> n > 15)
                .collect(Collectors.toList());

        System.out.println("Greater than 15: " + greaterThan15);

        // 3. Sort numbers in ascending order
        List<Integer> sorted = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted: " + sorted);

        // 4. Sort numbers in descending order
        List<Integer> descending = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Descending: " + descending);

        // 5. Count even numbers
        long evenCount = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("Even Count: " + evenCount);

        // 6. Find the maximum number
        Optional<Integer> maximum = numbers.stream()
                .max(Integer::compareTo);

        System.out.println("Maximum: " + maximum.orElse(0));

        // 7. Remove duplicate numbers
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique Numbers: " + uniqueNumbers);

        // 8. Square every number
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Squares: " + squares);

        // 9. Sum all numbers
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum: " + sum);
    }
}
