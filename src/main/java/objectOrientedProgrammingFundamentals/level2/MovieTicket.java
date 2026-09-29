/*
 * Question:
 * Create a MovieTicket class with attributes movieName, seatNumber,
 * and price.
 * Add methods to book a ticket by assigning the seat and updating
 * the price, and to display ticket details.
 *
 * Hint:
 * Use private attributes, a constructor, getter and setter methods,
 * a booking method, and a display method.
 *
 * Author: Asher Mustafa
 * Date: 29 - 09 - 2026
 */

public class MovieTicket {

    // Store the movie name
    private String movieName;

    // Store the booked seat number
    private String seatNumber;

    // Store the ticket price
    private double price;

    // Constructor to initialize movie details
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Not Booked";
        this.price = 0;
    }

    // Getter to return the movie name
    public String getMovieName() {
        return movieName;
    }

    // Setter to update the movie name
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    // Getter to return the seat number
    public String getSeatNumber() {
        return seatNumber;
    }

    // Setter to update the seat number
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    // Getter to return the ticket price
    public double getPrice() {
        return price;
    }

    // Setter to update the ticket price
    public void setPrice(double price) {
        this.price = price;
    }

    // Book the movie ticket by assigning a seat and price
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully.");
    }

    // Display the ticket details
    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    // Main method to test the MovieTicket class
    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket("Interstellar");

        // Book a seat and assign the ticket price
        ticket.bookTicket("A10", 250);

        // Display the ticket details
        ticket.displayDetails();
    }
}
