/*
Problem 2 - GCR Level 1 Practice Programs
Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ 

* Author: Asher Mustafa
* Date: 21-09-2026
*/

public class Problem02_PCMAverage {
    public static void main(String[] args) {
        double maths = 94; // Store Maths marks.
        double physics = 95; // Store Physics marks.
        double chemistry = 96; // Store Chemistry marks.
        double average = (maths + physics + chemistry) / 3; // Calculate the average percentage.

        System.out.println("Sam's average mark in PCM is " + average); // Display the average mark.
    }
}
