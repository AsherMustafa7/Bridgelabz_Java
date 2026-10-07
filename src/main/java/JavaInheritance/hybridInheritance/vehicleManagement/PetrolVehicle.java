/*
 * Sample Problem 2: Create PetrolVehicle as a Vehicle subclass that implements Refuelable.
 *
 * Hint:
 * PetrolVehicle extends Vehicle and implements Refuelable.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hybridInheritance.vehicleManagement;

class PetrolVehicle extends Vehicle implements Refuelable {
    // Initialize the petrol vehicle.
    PetrolVehicle(double maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Implement the Refuelable behavior.
    @Override
    public void refuel() {
        System.out.println(model + " is being refueled.");
    }
}
