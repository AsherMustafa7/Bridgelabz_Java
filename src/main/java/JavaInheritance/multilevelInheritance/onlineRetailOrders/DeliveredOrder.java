/*
 * Sample Problem 1: Create DeliveredOrder extending ShippedOrder with deliveryDate.
 *
 * Hint:
 * This creates Order -> ShippedOrder -> DeliveredOrder.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.multilevelInheritance.onlineRetailOrders;

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    // Initialize all levels of the order hierarchy.
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Return the delivered status.
    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }

    // Display all order information.
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
