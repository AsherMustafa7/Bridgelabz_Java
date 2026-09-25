/*
Question:
12. Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the total, average, and percentage score.

Hints:
1. Take input for the number of students.
2. Write a method to generate random 2 digit scores for Physics, Chemistry, and Math and return a 2D array.
3. Write a method to calculate total, average, and percentage for each student and return a 2D array. Round values to 2 digits using Math.round.
4. Write a method to display the scorecard of all students with scores, total, average, and percentage in tabular format using tab spacing.
5. Grades are A for 80 percent and above, B for 70 to 79, C for 60 to 69, D for 50 to 59, E for 40 to 49, and R for 39 and below.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

public class StudentScoreCard {

    // Generate random two digit marks for every subject.
    public int[][] generateScores(int studentCount) {
        int[][] scores = new int[studentCount][3];

        for (int i = 0; i < studentCount; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 91) + 10;
            }
        }
        return scores;
    }

    // Calculate total, average, and percentage for every student.
    public double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = total / 3.0;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Determine the grade from the percentage.
    public char findGrade(double percentage) {
        if (percentage >= 80) {
            return 'A';
        } else if (percentage >= 70) {
            return 'B';
        } else if (percentage >= 60) {
            return 'C';
        } else if (percentage >= 50) {
            return 'D';
        } else if (percentage >= 40) {
            return 'E';
        }
        return 'R';
    }

    // Display the complete scorecard.
    public void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student	Physics	Chemistry	Maths	Total	Average	Percentage	Grade");

        for (int i = 0; i < scores.length; i++) {
            char grade = findGrade(results[i][2]);
            System.out.printf("%d	%d	%d		%d	%.0f	%.2f	%.2f		%c%n",
                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grade);
        }
    }

    public static void main(String[] args) {
        // Create the scanner object.
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Create the class object.
        StudentScoreCard scoreCard = new StudentScoreCard();

        // Take the number of students.
        System.out.print("Enter number of students: ");
        int studentCount = sc.nextInt();

        // Validate the number of students.
        if (studentCount <= 0) {
            System.out.println("Invalid number of students.");
        } else {
            // Generate subject scores.
            int[][] scores = scoreCard.generateScores(studentCount);

            // Calculate student results.
            double[][] results = scoreCard.calculateResults(scores);

            // Display the scorecard.
            scoreCard.displayScorecard(scores, results);
        }

        // Close the scanner.
        sc.close();
    }
}
