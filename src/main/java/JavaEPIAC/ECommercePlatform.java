/*
 * Problem 2: E-Commerce Platform
Develop a simplified e-commerce platform using an abstract Product class.
Product must contain productId, name, and price and provide an abstract calculateDiscount() method.
Create Electronics, Clothing, and Groceries subclasses.
Create a Taxable interface with calculateTax() and getTaxDetails().
Use encapsulation with private product fields and validated setters.
Use polymorphism to calculate and print the final price using price + tax - discount for a list of Product references.
 *
 * Hint:
 * Keep common product data in Product. Let every product type define its own discount. Use Taxable for products that provide tax behavior.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaEPIAC;

import java.util.ArrayList;

// Define tax-related behavior.
interface Taxable {
    // Calculate tax for the product.
    double calculateTax();

    // Return tax information.
    String getTaxDetails();
}

// Define the common product structure.
abstract class Product {
    private int productId;
    private String name;
    private double price;

    // Initialize product information.
    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = Math.max(price, 0);
    }

    // Return the product ID.
    public int getProductId() {
        return productId;
    }

    // Return the product name.
    public String getName() {
        return name;
    }

    // Return the product price.
    public double getPrice() {
        return price;
    }

    // Update the product name only when valid.
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    // Update the product price only when valid.
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    // Require every product type to calculate its discount.
    public abstract double calculateDiscount();
}

// Represent an electronics product.
class Electronics extends Product implements Taxable {

    // Initialize an electronics product.
    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Calculate a 10 percent discount.
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    // Calculate 18 percent tax.
    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    // Return electronics tax details.
    @Override
    public String getTaxDetails() {
        return "Electronics tax rate: 18%";
    }
}

// Represent a clothing product.
class Clothing extends Product implements Taxable {

    // Initialize a clothing product.
    Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Calculate a 15 percent discount.
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15;
    }

    // Calculate 12 percent tax.
    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }

    // Return clothing tax details.
    @Override
    public String getTaxDetails() {
        return "Clothing tax rate: 12%";
    }
}

// Represent a grocery product.
class Groceries extends Product implements Taxable {

    // Initialize a grocery product.
    Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Calculate a 5 percent discount.
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }

    // Calculate 5 percent tax.
    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }

    // Return grocery tax details.
    @Override
    public String getTaxDetails() {
        return "Groceries tax rate: 5%";
    }
}

// Test polymorphic product processing.
class ECommercePlatform {

    // Calculate the final price for every product.
    static void processProducts(ArrayList<Product> products) {
        for (Product product : products) {
            double tax = 0;

            // Use the Taxable interface when the product provides tax behavior.
            if (product instanceof Taxable) {
                Taxable taxable = (Taxable) product;
                tax = taxable.calculateTax();
            }

            // Calculate final price using the required formula.
            double finalPrice = product.getPrice() + tax - product.calculateDiscount();

            System.out.println("Product: " + product.getName());
            System.out.println("Original Price: " + product.getPrice());
            System.out.println("Discount: " + product.calculateDiscount());
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a list that stores Product references.
        ArrayList<Product> products = new ArrayList<>();

        // Add different product types to the same list.
        products.add(new Electronics(1, "Laptop", 70000));
        products.add(new Clothing(2, "Jacket", 4000));
        products.add(new Groceries(3, "Groceries Pack", 2000));

        // Process every product polymorphically.
        processProducts(products);
    }
}
