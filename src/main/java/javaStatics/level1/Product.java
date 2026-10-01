package javaStatics.level1;

/*
 * Question:
 * Create a Product class to manage shopping cart items with the following features:
 * 1. Static:
 *    - A static variable discount shared by all products.
 *    - A static method updateDiscount() to modify the discount percentage.
 * 2. This:
 *    - Use this to initialize productName, price, and quantity in the constructor.
 * 3. Final:
 *    - Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
 * 4. Instanceof:
 *    - Validate whether an object is an instance of the Product class before processing its details.
 *
 * Author: Asher Mustafa
 * Date: 01 - 10 - 2026
 */

public class Product {
    static double discount = 10.0;

    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double discount) {
        Product.discount = discount;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productID);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }

    public static void main(String[] args) {
        // Create a Product object.
        Product product = new Product("Laptop", 50000.0, 2, 101);

        // Check whether the object is an instance of Product.
        if (product instanceof Product) {
            product.displayDetails();
        }

        // Update the shared discount.
        Product.updateDiscount(15.0);

        // Display the product again with the updated discount.
        product.displayDetails();
    }
}
