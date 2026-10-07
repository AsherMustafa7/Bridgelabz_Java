/*
 * Question:
 * Design an e-commerce platform with Order, Customer, and Product classes.
 * Model relationships where a Customer places an Order, and each Order
 * contains multiple Product objects.
 *
 * Goal:
 * Show communication and object relationships by designing a system where
 * customers communicate through orders and orders aggregate products.
 *
 * Hint:
 * Keep Customer, Order, and Product as separate objects.
 * Let Customer place an Order.
 * Store multiple Product objects inside Order using ArrayList.
 *
 * Author: Asher Mustafa
 * Date: 04 - 10 - 2026
 */
package ObjectRelationshipsAndCommunication.selfProblems.ecommercePlatform;
import java.util.ArrayList;

class Order {
    // Store the order identifier.
    private String orderId;
    // Store Product objects aggregated by the Order.
    private ArrayList<Product> products;

    // Create an Order with the given identifier.
    Order(String orderId) {
        // Assign the order identifier.
        this.orderId = orderId;
        // Create the Product list.
        products = new ArrayList<>();
    }

    // Add an existing Product to the Order.
    void addProduct(Product product) {
        // Add the Product to the Order.
        products.add(product);
    }

    // Return the order identifier.
    String getOrderId() {
        // Return the stored order identifier.
        return orderId;
    }

    // Display all Products contained in the Order.
    void displayProducts() {
        // Display the order identifier.
        System.out.println("Order: " + orderId);
        // Visit every Product in the Order.
        for (Product product : products) {
            // Display the current Product name.
            System.out.println("Product: " + product.getProductName());
        }
    }
}
