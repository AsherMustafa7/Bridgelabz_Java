/*
1. Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.

Hint =>
1. Simple Interest = Principal * Rate * Time / 100
2. Take user input for principal, rate, time
3. Write a method to calculate the simple interest given principle, rate and time as parameters
4. Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
* Author: Asher Mustafa
* Date: 24-09-2026
*/

import java.util.Scanner;

public class SimpleInterest {
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return principal * rate * time / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleInterest simpleInterest = new SimpleInterest();

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double interest = simpleInterest.calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + interest
                + " for Principal " + principal
                + ", Rate of Interest " + rate
                + " and Time " + time);

        sc.close();
    }
}
