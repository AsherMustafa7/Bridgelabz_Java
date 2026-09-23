/*
8. Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array.

Hint =>
1. Take user input for rows and columns, create a 2D array (Matrix), and take the user input.
2. Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows * columns as in int[] array = new int[rows * columns].
3. Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index.
4. Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element.

* Author: Asher Mustafa
* Date: 23-09-2026
*/
import java.util.Scanner;

public class TwoDArrayToOneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] array = new int[rows * columns];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        System.out.print("1D array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
