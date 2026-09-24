/*
10. Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates

Hint =>
1. Get an integer value from user for the numberOfchocolates and numberOfChildren.
2. Write the method to find the number of chocolates each child gets and number of remaining chocolates

public static int[] findRemainderAndQuotient(int number, int divisor)
* Author: Asher Mustafa
* Date: 24-09-2026
*/

import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);

        sc.close();
    }
}
