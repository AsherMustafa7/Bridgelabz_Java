/*
Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint =>
Define an array of 10 integer elements and take user input for the student's age.
Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote.
Author :Asher Mustafa
Date:  22/09/2026
* */
import java.util.*;
public class CanStudentsVote
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        // making the scanner object
        ArrayList<Integer> ar= new ArrayList<>();
        System.out.println("Please Enter the 10 values");
        // printing the required statements
        for(int i =0; i <10;i++)
        {
            int a =sc.nextInt();
            ar.add(a);
        }
        // storing the values
        for(int i =0; i <10;i++)
        {
            if(ar.get(i)<0)
            {
                System.out.println(ar.get(i)+ " Age is Invalid for ");
            }
            else if(ar.get(i)<18)
            {
                System.out.println(ar.get(i)+" Is a Invalid age for voting");
            }
            else {
                System.out.println(ar.get(i)+" Is a valid age for voting");
            }
        }
        // The actual logic
    }
}
