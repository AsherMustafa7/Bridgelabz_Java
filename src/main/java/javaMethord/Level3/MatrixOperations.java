/*
Question:
13. Write a program to perform matrix manipulation operations like addition, subtraction, multiplication, and transpose. Also find the determinant and inverse of a matrix. The program should take random matrices as input and display the results.

Hints:
1. Write a method to create a random matrix taking rows and columns as parameters.
2. Write a method to add two matrices.
3. Write a method to subtract two matrices.
4. Write a method to multiply two matrices.
5. Write a method to find the transpose.
6. Write a method to find the determinant of a 2 by 2 matrix.
7. Write a method to find the determinant of a 3 by 3 matrix.
8. Write a method to find the inverse of a 2 by 2 matrix.
9. Write a method to find the inverse of a 3 by 3 matrix.
10. Write a method to display a matrix.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

public class MatrixOperations {

    // Create a random matrix with the requested dimensions.
    public int[][] createRandomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
        return matrix;
    }

    // Add two matrices.
    public int[][] addMatrices(int[][] first, int[][] second) {
        int rows = first.length;
        int columns = first[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        return result;
    }

    // Subtract two matrices.
    public int[][] subtractMatrices(int[][] first, int[][] second) {
        int rows = first.length;
        int columns = first[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = first[i][j] - second[i][j];
            }
        }
        return result;
    }

    // Multiply two compatible matrices.
    public int[][] multiplyMatrices(int[][] first, int[][] second) {
        int[][] result = new int[first.length][second[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second[0].length; j++) {
                for (int k = 0; k < second.length; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }
        return result;
    }

    // Find the transpose of a matrix.
    public int[][] transposeMatrix(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Find the determinant of a 2 by 2 matrix.
    public int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Find the determinant of a 3 by 3 matrix.
    public int determinant3x3(int[][] matrix) {
        int first = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);
        int second = matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        int third = matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return first - second + third;
    }

    // Find the inverse of a 2 by 2 matrix.
    public double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);

        if (determinant == 0) {
            return null;
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;
        return inverse;
    }

    // Find the inverse of a 3 by 3 matrix using cofactors.
    public double[][] inverse3x3(int[][] matrix) {
        int determinant = determinant3x3(matrix);

        if (determinant == 0) {
            return null;
        }

        double[][] cofactor = new double[3][3];

        cofactor[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        cofactor[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        cofactor[0][2] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];

        cofactor[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        cofactor[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        cofactor[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);

        cofactor[2][0] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        cofactor[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        cofactor[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        double[][] inverse = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = cofactor[j][i] / determinant;
            }
        }
        return inverse;
    }

    // Display an integer matrix.
    public void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%5d", value);
            }
            System.out.println();
        }
    }

    // Display a double matrix.
    public void displayDoubleMatrix(double[][] matrix) {
        if (matrix == null) {
            System.out.println("Inverse does not exist.");
            return;
        }

        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create the scanner object.
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Create the class object.
        MatrixOperations operations = new MatrixOperations();

        // Take matrix dimensions.
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        // Validate dimensions.
        if (rows <= 0 || columns <= 0) {
            System.out.println("Invalid matrix dimensions.");
            sc.close();
            return;
        }

        // Create two random matrices.
        int[][] first = operations.createRandomMatrix(rows, columns);
        int[][] second = operations.createRandomMatrix(rows, columns);

        // Display the first matrix.
        System.out.println("First Matrix");
        operations.displayMatrix(first);

        // Display the second matrix.
        System.out.println("Second Matrix");
        operations.displayMatrix(second);

        // Display addition when dimensions match.
        System.out.println("Addition");
        operations.displayMatrix(operations.addMatrices(first, second));

        // Display subtraction when dimensions match.
        System.out.println("Subtraction");
        operations.displayMatrix(operations.subtractMatrices(first, second));

        // Display the transpose of the first matrix.
        System.out.println("Transpose of First Matrix");
        operations.displayMatrix(operations.transposeMatrix(first));

        // Display multiplication when matrices are square.
        if (rows == columns) {
            System.out.println("Multiplication");
            operations.displayMatrix(operations.multiplyMatrices(first, second));

            // Display determinant and inverse for a 2 by 2 matrix.
            if (rows == 2) {
                System.out.println("Determinant of First Matrix: " + operations.determinant2x2(first));
                System.out.println("Inverse of First Matrix");
                operations.displayDoubleMatrix(operations.inverse2x2(first));
            }

            // Display determinant and inverse for a 3 by 3 matrix.
            if (rows == 3) {
                System.out.println("Determinant of First Matrix: " + operations.determinant3x3(first));
                System.out.println("Inverse of First Matrix");
                operations.displayDoubleMatrix(operations.inverse3x3(first));
            }
        } else {
            // Explain why square-only operations are skipped.
            System.out.println("Multiplication and inverse examples require compatible or square matrices.");
        }

        // Close the scanner.
        sc.close();
    }
}
