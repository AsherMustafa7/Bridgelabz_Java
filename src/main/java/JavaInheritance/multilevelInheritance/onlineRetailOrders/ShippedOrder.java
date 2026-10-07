/*
 * Sample Problem 1: Create ShippedOrder extending Order with trackingNumber.
 *
 * Hint:
 * Use Order as the direct superclass.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.multilevelInheritance.onlineRetailOrders;

class ShippedOrder extends Order {
    private String trackingNumber;

    // Initialize inherited and shipped-order data.
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Return the shipped status.
    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }

    // Display inherited and tracking information.
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
