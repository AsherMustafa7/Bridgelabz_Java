/*
6. Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.

Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false
* Author: Asher Mustafa
* Date: 24-09-2026
*/

import java.util.Scanner;

public class SpringSeason {
    public boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20)
                || (month == 4)
                || (month == 5)
                || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpringSeason springSeason = new SpringSeason();

        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        boolean spring = springSeason.isSpringSeason(month, day);

        if (spring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        sc.close();
    }
}
