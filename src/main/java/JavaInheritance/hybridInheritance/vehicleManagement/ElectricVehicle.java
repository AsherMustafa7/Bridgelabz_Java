/*
 * Sample Problem 2: Create ElectricVehicle as a Vehicle subclass with charge().
 *
 * Hint:
 * Extend Vehicle and add electric-specific behavior.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hybridInheritance.vehicleManagement;

class ElectricVehicle extends Vehicle {
    // Initialize the electric vehicle.
    ElectricVehicle(double maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Define electric vehicle charging behavior.
    void charge() {
        System.out.println(model + " is charging.");
    }
}
