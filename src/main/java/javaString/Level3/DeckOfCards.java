/*
Question:
Create a program to create a deck of cards, initialize the deck, shuffle the deck, and distribute the deck of n cards to x players. Finally print the cards the players have.
Hint:
1. Use suits Hearts, Diamonds, Clubs, and Spades.
2. Use ranks 2 through Ace.
3. Calculate the deck size using suits length multiplied by ranks length.
4. Create a method to initialize and return the deck.
5. Create a method to shuffle by swapping each card with a random remaining card.
6. Create a method to distribute n cards to x players when the cards can be divided equally.
7. Create a method to print players and their cards.
Author: Asher Mustafa
Date: 27 - 09 - 2026
*/
import java.util.Scanner;
public class DeckOfCards {
    // Initialize a deck using suits and ranks.
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        // Calculate the total number of cards.
        int numOfCards = suits.length * ranks.length;
        // Create the deck array.
        String[] deck = new String[numOfCards];
        // Start the deck index.
        int index = 0;
        // Loop through suits.
        for (int i = 0; i < suits.length; i++) {
            // Loop through ranks.
            for (int j = 0; j < ranks.length; j++) {
                // Create and store the card.
                deck[index] = ranks[j] + " of " + suits[i];
                // Move to the next position.
                index++;
            }
        }
        // Return the initialized deck.
        return deck;
    }
    // Shuffle the deck using random swapping.
    public static String[] shuffleDeck(String[] deck) {
        // Store the deck size.
        int n = deck.length;
        // Iterate through every card position.
        for (int i = 0; i < n; i++) {
            // Generate a random remaining card position.
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Save the current card.
            String temp = deck[i];
            // Put the random card at the current position.
            deck[i] = deck[randomCardNumber];
            // Put the saved card at the random position.
            deck[randomCardNumber] = temp;
        }
        // Return the shuffled deck.
        return deck;
    }
    // Distribute n cards equally among x players.
    public static String[][] distributeCards(String[] deck, int n, int players) {
        // Validate the number of cards and players.
        if (n <= 0 || n > deck.length || players <= 0 || n % players != 0) return null;
        // Calculate cards per player.
        int cardsPerPlayer = n / players;
        // Create the player card array.
        String[][] playerCards = new String[players][cardsPerPlayer];
        // Start at the first card.
        int cardIndex = 0;
        // Process every player.
        for (int i = 0; i < players; i++) {
            // Give cards to the current player.
            for (int j = 0; j < cardsPerPlayer; j++) {
                // Store one card.
                playerCards[i][j] = deck[cardIndex];
                // Move to the next card.
                cardIndex++;
            }
        }
        // Return the distributed cards.
        return playerCards;
    }
    // Print all players and their cards.
    public static void printPlayers(String[][] playerCards) {
        // Loop through all players.
        for (int i = 0; i < playerCards.length; i++) {
            // Print the player number.
            System.out.println("Player " + (i + 1) + ":");
            // Print every card of the player.
            for (int j = 0; j < playerCards[i].length; j++) System.out.println("  " + playerCards[i][j]);
            // Add a blank line.
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Create Scanner.
        Scanner sc = new Scanner(System.in);
        // Define the four suits.
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        // Define the thirteen ranks.
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        // Create the complete deck.
        String[] deck = initializeDeck(suits, ranks);
        // Shuffle the deck.
        shuffleDeck(deck);
        // Take the number of cards.
        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        // Take the number of players.
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        // Distribute the cards.
        String[][] playerCards = distributeCards(deck, n, players);
        // Check whether distribution was possible.
        if (playerCards != null) printPlayers(playerCards);
        else System.out.println("Cards cannot be distributed equally.");
        // Close Scanner.
        sc.close();
    }
}
