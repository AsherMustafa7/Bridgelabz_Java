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
class Customer {
    // Store the customer name.
    private String name;

    // Create a Customer with the given name.
    Customer(String name) {
        // Assign the customer name.
        this.name = name;
    }

    // Place an Order for this Customer.
    void placeOrder(Order order) {
        // Communicate with the Order object by displaying the order action.
        System.out.println(name + " placed order " + order.getOrderId());
    }
}
