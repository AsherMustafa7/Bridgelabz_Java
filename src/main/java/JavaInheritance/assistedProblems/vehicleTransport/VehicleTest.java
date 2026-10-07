/*
 * Problem 3: Vehicle and Transport System. Store subclasses in a Vehicle array and call displayInfo().
 *
 * Hint:
 * Use Vehicle[] for polymorphism.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.assistedProblems.vehicleTransport;

class VehicleTest {
    public static void main(String[] args) {
        // Store different vehicle types in a Vehicle array.
        Vehicle[] vehicles = {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 5000),
            new Motorcycle(160, "Petrol", 350)
        };

        // Each object uses its overridden displayInfo().
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
