/*
 * Sample Problem 2: Demonstrate Vehicle inheritance, Refuelable, and ElectricVehicle charging.
 *
 * Hint:
 * Use both inherited and interface-based behavior.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hybridInheritance.vehicleManagement;

class VehicleTest {
    public static void main(String[] args) {
        // Create an electric vehicle.
        ElectricVehicle electricVehicle = new ElectricVehicle(180, "EV-01");

        // Create a petrol vehicle.
        PetrolVehicle petrolVehicle = new PetrolVehicle(200, "Petrol-01");

        // Use inherited behavior.
        electricVehicle.displayInfo();
        petrolVehicle.displayInfo();

        // Use subclass-specific behavior.
        electricVehicle.charge();

        // Use interface behavior.
        petrolVehicle.refuel();
    }
}
