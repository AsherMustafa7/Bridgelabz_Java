/*
5. Create a program to find the mean height of players present in a football team.

Hint =>
1. The formula to calculate the mean is: mean = sum of all elements / number of elements.
2. Create a double array named heights of size 11 and get input values from the user.
3. Find the sum of all the elements present in the array.
4. Divide the sum by 11 to find the mean height and print the mean height of the football team.

* Author: Asher Mustafa
* Date: 23-09-2026
*/
import java.util.Scanner;

public class MeanHeightFootballTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + " in cm: ");
            heights[i] = sc.nextDouble();
        }

        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.println("Mean height of the football team = " + mean + " cm");

        sc.close();
    }
}
