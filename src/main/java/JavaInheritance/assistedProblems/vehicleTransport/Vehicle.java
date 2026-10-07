/*
 * Problem 3: Vehicle and Transport System. Define Vehicle with maxSpeed, fuelType, and displayInfo().
 *
 * Hint:
 * Use Vehicle as the superclass.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.assistedProblems.vehicleTransport;

class Vehicle {
    private double maxSpeed;
    private String fuelType;

    // Initialize common vehicle data.
    Vehicle(double maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Display common vehicle information.
    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}
