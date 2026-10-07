/*
 * Sample Problem 2: Vehicle Management System with Hybrid Inheritance. Define Vehicle with maxSpeed and model.
 *
 * Hint:
 * Use Vehicle as the superclass.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hybridInheritance.vehicleManagement;

class Vehicle {
    protected double maxSpeed;
    protected String model;

    // Initialize common vehicle data.
    Vehicle(double maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Display common vehicle information.
    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed);
    }
}
