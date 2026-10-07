/*
 * Problem 3: Vehicle and Transport System. Define Motorcycle with engineCapacity and override displayInfo().
 *
 * Hint:
 * Extend Vehicle and call super.displayInfo().
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.assistedProblems.vehicleTransport;

class Motorcycle extends Vehicle {
    private int engineCapacity;

    // Initialize inherited and subclass-specific data.
    Motorcycle(double maxSpeed, String fuelType, int engineCapacity) {
        super(maxSpeed, fuelType);
        this.engineCapacity = engineCapacity;
    }

    // Display common and subclass-specific information.
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}
