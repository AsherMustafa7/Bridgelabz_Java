/*
Problem 1 - GCR Level 1 Practice Programs
Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
I/P => NONE
O/P => Harry's age in 2024 is ___ 

* Author: Asher Mustafa
* Date: 21-09-2026
*/

public class Problem01_HarryAge {
    public static void main(String[] args) {
        int birthYear = 2000; // Store Harry's birth year.
        int currentYear = 2024; // Store the current year.
        int age = currentYear - birthYear; // Calculate Harry's age.

        System.out.println("Harry's age in " + currentYear + " is " + age); // Display Harry's age.
    }
}
