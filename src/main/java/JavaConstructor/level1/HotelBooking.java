package JavaConstructor.level1;

/*
 * Question:
 * Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings.
 *
 * Hint:
 * Create three constructors: default, parameterized, and copy. Display each booking.
 *
 * Author: Asher Mustafa
 * Date: 30 - 09 - 2026
 */

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this("Unknown", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking booking) {
        this(booking.guestName, booking.roomType, booking.nights);
    }

    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Asher", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);
        System.out.println("Default Constructor:"); b1.displayDetails();
        System.out.println("\nParameterized Constructor:"); b2.displayDetails();
        System.out.println("\nCopy Constructor:"); b3.displayDetails();
    }
}
