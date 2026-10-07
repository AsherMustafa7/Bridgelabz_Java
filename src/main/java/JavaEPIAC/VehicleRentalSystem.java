/*
 * Problem 3: RentalVehicle Rental System
Design a vehicle rental system using an abstract RentalVehicle class.
RentalVehicle must contain vehicleNumber, type, and rentalRate.
Provide an abstract calculateRentalCost(int days) method.
Create RentalCar, RentalBike, and Truck subclasses with specific implementations.
Create an Insurable interface with calculateInsurance() and getInsuranceDetails().
Keep sensitive insurance policy information private.
Use polymorphism to calculate rental and insurance costs for a list of RentalVehicle references.
 *
 * Hint:
 * Keep shared rental information in RentalVehicle and let each vehicle calculate its own rental cost. Use Insurable for insurance behavior.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaEPIAC;

import java.util.ArrayList;

// Define insurance-related behavior.
interface Insurable {
    // Calculate insurance cost.
    double calculateInsurance();

    // Return insurance details.
    String getInsuranceDetails();
}

// Define the common vehicle structure.
abstract class RentalVehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Initialize common vehicle information.
    RentalVehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = Math.max(rentalRate, 0);
    }

    // Return the vehicle number.
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    // Return the vehicle type.
    public String getType() {
        return type;
    }

    // Return the rental rate.
    public double getRentalRate() {
        return rentalRate;
    }

    // Update rental rate only when valid.
    public void setRentalRate(double rentalRate) {
        if (rentalRate >= 0) {
            this.rentalRate = rentalRate;
        }
    }

    // Require every vehicle type to calculate its rental cost.
    public abstract double calculateRentalCost(int days);
}

// Represent a car.
class RentalCar extends RentalVehicle implements Insurable {
    private String insurancePolicyNumber;

    // Initialize car information.
    RentalCar(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "RentalCar", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Calculate car rental cost.
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * Math.max(days, 0);
    }

    // Calculate car insurance.
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10;
    }

    // Return insurance details without exposing the private policy number.
    @Override
    public String getInsuranceDetails() {
        return "RentalCar insurance is active. Policy number is protected.";
    }
}

// Represent a bike.
class RentalBike extends RentalVehicle implements Insurable {
    private String insurancePolicyNumber;

    // Initialize bike information.
    RentalBike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "RentalBike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Calculate bike rental cost.
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * Math.max(days, 0);
    }

    // Calculate bike insurance.
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    // Return insurance details without exposing the private policy number.
    @Override
    public String getInsuranceDetails() {
        return "RentalBike insurance is active. Policy number is protected.";
    }
}

// Represent a truck.
class Truck extends RentalVehicle implements Insurable {
    private String insurancePolicyNumber;

    // Initialize truck information.
    Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Calculate truck rental cost.
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * Math.max(days, 0);
    }

    // Calculate truck insurance.
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    // Return insurance details without exposing the private policy number.
    @Override
    public String getInsuranceDetails() {
        return "Truck insurance is active. Policy number is protected.";
    }
}

// Test polymorphic vehicle processing.
class VehicleRentalSystem {

    // Process rental and insurance costs for all vehicles.
    static void processVehicles(ArrayList<RentalVehicle> vehicles, int days) {
        for (RentalVehicle vehicle : vehicles) {
            System.out.println("RentalVehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("RentalVehicle Type: " + vehicle.getType());
            System.out.println("Rental Cost: " + vehicle.calculateRentalCost(days));

            // Use insurance behavior through the interface.
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a list of RentalVehicle references.
        ArrayList<RentalVehicle> vehicles = new ArrayList<>();

        // Add different vehicle types to the same list.
        vehicles.add(new RentalCar("CAR101", 2000, "CAR-POL-101"));
        vehicles.add(new RentalBike("BIKE102", 800, "BIKE-POL-102"));
        vehicles.add(new Truck("TRUCK103", 5000, "TRUCK-POL-103"));

        // Process all vehicles for three rental days.
        processVehicles(vehicles, 3);
    }
}
