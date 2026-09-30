package JavaConstructor.level1;

/*
 * Question:
 * Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize rental details and calculate total cost.
 *
 * Hint:
 * Use default and parameterized constructors. Add a method to calculate total cost using rental days and a fixed daily rate.
 *
 * Author: Asher Mustafa
 * Date: 30 - 09 - 2026
 */

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    public CarRental() {
        this("Unknown", "Standard", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = 2000.0;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Asher", "Toyota Camry", 4);
        r1.displayDetails();
        System.out.println();
        r2.displayDetails();
    }
}
