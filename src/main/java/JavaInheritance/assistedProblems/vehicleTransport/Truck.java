/*
 * Problem 3: Vehicle and Transport System. Define Truck with loadCapacity and override displayInfo().
 *
 * Hint:
 * Extend Vehicle and call super.displayInfo().
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.assistedProblems.vehicleTransport;

class Truck extends Vehicle {
    private double loadCapacity;

    // Initialize inherited and subclass-specific data.
    Truck(double maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // Display common and subclass-specific information.
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " kg");
    }
}
