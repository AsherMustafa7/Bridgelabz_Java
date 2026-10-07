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
class Product {
    // Store the product identifier.
    private String productId;
    // Store the product name.
    private String productName;

    // Create a Product with the given identifier and name.
    Product(String productId, String productName) {
        // Assign the product identifier.
        this.productId = productId;
        // Assign the product name.
        this.productName = productName;
    }

    // Return the product name.
    String getProductName() {
        // Return the stored product name.
        return productName;
    }
}
