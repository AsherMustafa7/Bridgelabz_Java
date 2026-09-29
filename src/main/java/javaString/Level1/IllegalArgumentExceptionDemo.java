package javaString.Level1;
/*
Question:
7. Write a program to demonstrate IllegalArgumentException using an invalid substring range and handle the runtime exception.

Hints:
1. Take a String input.
2. Use substring with start index greater than end index.
3. Use try catch for IllegalArgumentException and generic RuntimeException.
4. In Java, an invalid substring range is actually reported as StringIndexOutOfBoundsException, which is a RuntimeException, so the generic catch is also included.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/
import java.util.Scanner;
public class IllegalArgumentExceptionDemo
{
    public static void calling()
    {
        String str = "Asher Mustafa";
        int start = str.length();
        int end = 0;
        try
        {
            System.out.println("The substring : " + str.substring(start, end));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("The Exception " + e.getMessage());
            System.out.println("Error : " + e.getClass().getName());
            System.out.println("Error : " + e.getClass().getSimpleName());
        }
        catch (RuntimeException e)
        {
            System.out.println("The Exception " + e.getMessage());
            System.out.println("Error : " + e.getClass().getName());
            System.out.println("Error : " + e.getClass().getSimpleName());
        }
    }
    public static void main(String[] args)
    {
        calling();
        return;
    }
}