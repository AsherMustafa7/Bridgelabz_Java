package JavaConstructor.Extras;
/*
 * Question:
 * Vehicle Registration: Create Vehicle with instance variables ownerName and vehicleType, class variable registrationFee, instance method displayVehicleDetails(), and class method updateRegistrationFee().
 *
 * Hint:
 * Use static for registrationFee because it is shared by all vehicles. Use a static method to update it.
 *
 * Author: Asher Mustafa
 * Date: 30 - 09 - 2026
 */

public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 5000.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Asher", "Car");
        Vehicle v2 = new Vehicle("Rahul", "Bike");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(7500.0);
        v2.displayVehicleDetails();
        v1.displayVehicleDetails();
    }
}
