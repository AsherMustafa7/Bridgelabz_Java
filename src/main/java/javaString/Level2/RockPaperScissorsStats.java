/*
Question:
9. Rock-Paper-Scissors is a game played between a user and a computer. Based on the rules, either the player or the computer will win. Show the stats of player and computer wins in a tabular format across multiple games. Also show the winning percentage between the player and the computer.

Hints:
1. Rock beats scissors, paper beats rock, and scissors beats paper.
2. Create a method to find the computer choice using Math.random.
3. Create a method to find the winner between the user and the computer.
4. Create a method to find the average and percentage of wins for the user and computer and return a String 2D array.
5. Create a method to display the results of every game and the average and percentage wins.
6. In main take user input for the number of games and call methods to display results.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/

import java.util.Scanner;

public class RockPaperScissorsStats {

    // Generate a random computer choice.
    public static String getComputerChoice() {
        // Generate a random number from zero to two.
        int choice = (int) (Math.random() * 3);

        // Return the choice represented by the random number.
        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        }

        return "Scissors";
    }

    // Find the winner of one game.
    public static String findWinner(String userChoice, String computerChoice) {
        // Return Draw when both choices are the same.
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }

        // Check all cases where the user wins.
        if ((userChoice.equals("Rock") && computerChoice.equals("Scissors"))
                || (userChoice.equals("Paper") && computerChoice.equals("Rock"))
                || (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            return "Player";
        }

        // The remaining valid case is a computer win.
        return "Computer";
    }

    // Calculate player and computer win statistics.
    public static String[][] calculateStatistics(int playerWins, int computerWins, int draws, int games) {
        // Create rows for player and computer statistics.
        String[][] statistics = new String[2][3];

        // Calculate the player winning percentage.
        double playerPercentage = games == 0 ? 0 : (playerWins * 100.0) / games;

        // Calculate the computer winning percentage.
        double computerPercentage = games == 0 ? 0 : (computerWins * 100.0) / games;

        // Store player statistics.
        statistics[0][0] = "Player";
        statistics[0][1] = String.valueOf(playerWins);
        statistics[0][2] = String.format("%.2f", playerPercentage);

        // Store computer statistics.
        statistics[1][0] = "Computer";
        statistics[1][1] = String.valueOf(computerWins);
        statistics[1][2] = String.format("%.2f", computerPercentage);

        // Return the statistics array.
        return statistics;
    }

    // Display the results of every game and the final statistics.
    public static void displayResults(String[][] games, String[][] statistics, int draws) {
        // Display every game result.
        System.out.printf("%-8s %-15s %-15s %-15s%n",
                "Game", "Player", "Computer", "Winner");
        System.out.println("------------------------------------------------------------");

        // Display each game row.
        for (int i = 0; i < games.length; i++) {
            System.out.printf("%-8d %-15s %-15s %-15s%n",
                    i + 1, games[i][0], games[i][1], games[i][2]);
        }

        // Display the final statistics.
        System.out.println();
        System.out.printf("%-12s %-12s %-15s%n", "Participant", "Wins", "Win Percentage");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < statistics.length; i++) {
            System.out.printf("%-12s %-12s %-15s%n",
                    statistics[i][0], statistics[i][1], statistics[i][2]);
        }

        // Display the number of draws.
        System.out.println("Draws: " + draws);
    }

    public static void main(String[] args) {
        // Create the Scanner object.
        Scanner sc = new Scanner(System.in);

        // Take the number of games from the user.
        System.out.print("Enter number of games: ");
        int numberOfGames = sc.nextInt();

        // Check whether the number of games is valid.
        if (numberOfGames <= 0) {
            System.out.println("Number of games must be greater than 0.");
        } else {
            // Create an array to store every game result.
            String[][] games = new String[numberOfGames][3];

            // Initialize the win counters.
            int playerWins = 0;
            int computerWins = 0;
            int draws = 0;

            // Play the requested number of games.
            for (int i = 0; i < numberOfGames; i++) {
                // Ask the player for a choice.
                System.out.print("Game " + (i + 1) + " choose Rock, Paper, or Scissors: ");
                String userChoice = sc.next();

                // Normalize the first character and build a standard choice.
                if (userChoice.equalsIgnoreCase("rock")) {
                    userChoice = "Rock";
                } else if (userChoice.equalsIgnoreCase("paper")) {
                    userChoice = "Paper";
                } else if (userChoice.equalsIgnoreCase("scissors")) {
                    userChoice = "Scissors";
                } else {
                    // Use Rock as a safe default for invalid input.
                    System.out.println("Invalid choice. Rock is used for this game.");
                    userChoice = "Rock";
                }

                // Generate the computer choice.
                String computerChoice = getComputerChoice();

                // Find the winner.
                String winner = findWinner(userChoice, computerChoice);

                // Store the result.
                games[i][0] = userChoice;
                games[i][1] = computerChoice;
                games[i][2] = winner;

                // Update the correct counter.
                if (winner.equals("Player")) {
                    playerWins++;
                } else if (winner.equals("Computer")) {
                    computerWins++;
                } else {
                    draws++;
                }
            }

            // Calculate final statistics.
            String[][] statistics = calculateStatistics(
                    playerWins, computerWins, draws, numberOfGames);

            // Display all game results and statistics.
            displayResults(games, statistics, draws);
        }

        // Close the Scanner object.
        sc.close();
    }
}
