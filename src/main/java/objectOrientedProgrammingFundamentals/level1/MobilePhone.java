package objectOrientedProgrammingFundamentals.level1;
/*
 * Question:
 * Program to Handle Mobile Phone Details
 * Problem Statement:
 * Create a MobilePhone class with attributes brand, model, and price.
 * Add a method to display all the details of the phone.
 * The MobilePhone class uses attributes to store the phone characteristics.
 * The method is used to retrieve and display this information for each object.
 *
 * Author: Asher Mustafa
 * Date: 29 - 09 - 2026
 */
public class MobilePhone {
    // Store the phone brand.
    private String brand;
    // Store the phone model.
    private String model;
    // Store the phone price.
    private double price;

    // Constructor initializes all phone attributes.
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Return the phone brand.
    public String getBrand() {
        return brand;
    }

    // Set the phone brand.
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Return the phone model.
    public String getModel() {
        return model;
    }

    // Set the phone model.
    public void setModel(String model) {
        this.model = model;
    }

    // Return the phone price.
    public double getPrice() {
        return price;
    }

    // Set the phone price.
    public void setPrice(double price) {
        this.price = price;
    }

    // Display all phone details.
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    // Create a mobile phone object and display its details.
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("Samsung", "Galaxy S25", 75000);
        mobilePhone.displayDetails();
    }
}
