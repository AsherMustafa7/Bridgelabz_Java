package javaStatics.level1;

/*
 * Question:
 * Create a Vehicle class with the following features:
 * 1. Static:
 *    - A static variable registrationFee common for all vehicles.
 *    - A static method updateRegistrationFee() to modify the fee.
 * 2. This:
 *    - Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
 * 3. Final:
 *    - Use a final variable registrationNumber to uniquely identify each vehicle.
 * 4. Instanceof:
 *    - Check if an object belongs to the Vehicle class before displaying its registration details.
 *
 * Author: Asher Mustafa
 * Date: 01 - 10 - 2026
 */

public class Vehicle {
    static double registrationFee = 5000.0;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double registrationFee) {
        Vehicle.registrationFee = registrationFee;
    }

    public void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void main(String[] args) {
        // Create a Vehicle object.
        Vehicle vehicle = new Vehicle("Asher", "Car", "TN01AB1234");

        // Check whether the object is an instance of Vehicle.
        if (vehicle instanceof Vehicle) {
            vehicle.displayDetails();
        }

        // Update the shared registration fee.
        Vehicle.updateRegistrationFee(6000.0);

        // Display the updated registration fee.
        vehicle.displayDetails();
    }
}
