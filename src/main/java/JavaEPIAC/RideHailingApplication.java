/*
 * Problem 8: Ride-Hailing Application
Develop a ride-hailing application using an abstract RideVehicle class.
RideVehicle must contain vehicleId, driverName, and ratePerKm.
Provide abstract calculateFare(double distance) and concrete getVehicleDetails().
Create RideCar, RideBike, and Auto subclasses with type-specific fare calculations.
Create a GPS interface with getCurrentLocation() and updateLocation().
Use encapsulation to secure driver and vehicle details.
Use polymorphism to calculate fares for different vehicle types dynamically.
 *
 * Hint:
 * Keep common ride information in RideVehicle. Let each vehicle type calculate its fare and use GPS as an additional capability.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaEPIAC;

import java.util.ArrayList;

// Define GPS behavior.
interface GPS {
    // Return the current location.
    String getCurrentLocation();

    // Update the current location.
    void updateLocation(String location);
}

// Define the common ride vehicle structure.
abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Initialize common vehicle information.
    RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = Math.max(ratePerKm, 0);
    }

    // Return the vehicle ID.
    public String getVehicleId() {
        return vehicleId;
    }

    // Return the driver name.
    public String getDriverName() {
        return driverName;
    }

    // Return the rate per kilometer.
    public double getRatePerKm() {
        return ratePerKm;
    }

    // Require each vehicle type to calculate its fare.
    public abstract double calculateFare(double distance);

    // Display common vehicle details.
    public void getVehicleDetails() {
        System.out.println("RideVehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate Per Km: " + ratePerKm);
    }
}

// Represent a car ride.
class RideCar extends RideVehicle implements GPS {
    private String currentLocation;

    // Initialize car information.
    RideCar(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Calculate car fare.
    @Override
    public double calculateFare(double distance) {
        return Math.max(distance, 0) * getRatePerKm();
    }

    // Return the current car location.
    @Override
    public String getCurrentLocation() {
        return currentLocation == null ? "Location unavailable" : currentLocation;
    }

    // Update the car location.
    @Override
    public void updateLocation(String location) {
        if (location != null && !location.trim().isEmpty()) {
            currentLocation = location;
        }
    }
}

// Represent a bike ride.
class RideBike extends RideVehicle implements GPS {
    private String currentLocation;

    // Initialize bike information.
    RideBike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Calculate bike fare using a type-specific factor.
    @Override
    public double calculateFare(double distance) {
        return Math.max(distance, 0) * getRatePerKm() * 0.80;
    }

    // Return the current bike location.
    @Override
    public String getCurrentLocation() {
        return currentLocation == null ? "Location unavailable" : currentLocation;
    }

    // Update the bike location.
    @Override
    public void updateLocation(String location) {
        if (location != null && !location.trim().isEmpty()) {
            currentLocation = location;
        }
    }
}

// Represent an auto ride.
class Auto extends RideVehicle implements GPS {
    private String currentLocation;

    // Initialize auto information.
    Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Calculate auto fare using a type-specific factor.
    @Override
    public double calculateFare(double distance) {
        return Math.max(distance, 0) * getRatePerKm() * 0.90;
    }

    // Return the current auto location.
    @Override
    public String getCurrentLocation() {
        return currentLocation == null ? "Location unavailable" : currentLocation;
    }

    // Update the auto location.
    @Override
    public void updateLocation(String location) {
        if (location != null && !location.trim().isEmpty()) {
            currentLocation = location;
        }
    }
}

// Test polymorphic fare calculation.
class RideHailingApplication {

    // Calculate fares for different vehicle types.
    static void calculateFares(ArrayList<RideVehicle> vehicles, double distance) {
        for (RideVehicle vehicle : vehicles) {
            System.out.println("RideVehicle: " + vehicle.getVehicleId());
            System.out.println("Driver: " + vehicle.getDriverName());
            System.out.println("Fare: " + vehicle.calculateFare(distance));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a list of RideVehicle references.
        ArrayList<RideVehicle> vehicles = new ArrayList<>();

        // Create different vehicle types.
        RideCar car = new RideCar("CAR101", "Arun", 20);
        RideBike bike = new RideBike("BIKE102", "Ravi", 12);
        Auto auto = new Auto("AUTO103", "Kiran", 15);

        // Update locations through GPS behavior.
        car.updateLocation("Chennai");
        bike.updateLocation("Tambaram");
        auto.updateLocation("Kanchipuram");

        // Add all vehicle types to the same list.
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Calculate fares for a 10 kilometer ride.
        calculateFares(vehicles, 10);

        // Access GPS behavior through the interface.
        GPS gps = car;
        System.out.println("Current Location: " + gps.getCurrentLocation());
    }
}
