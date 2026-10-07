/*
 * Problem 3: Vehicle and Transport System. Define Car with seatCapacity and override displayInfo().
 *
 * Hint:
 * Extend Vehicle and call super.displayInfo().
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.assistedProblems.vehicleTransport;

class Car extends Vehicle {
    private int seatCapacity;

    // Initialize inherited and subclass-specific data.
    Car(double maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Display common and subclass-specific information.
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
