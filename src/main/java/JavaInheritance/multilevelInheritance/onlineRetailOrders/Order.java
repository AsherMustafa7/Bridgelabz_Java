/*
 * Sample Problem 1: Online Retail Order Management. Define Order with orderId, orderDate, and getOrderStatus().
 *
 * Hint:
 * Order is the first level of the hierarchy.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.multilevelInheritance.onlineRetailOrders;

class Order {
    private int orderId;
    private String orderDate;

    // Initialize common order information.
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Return the base order status.
    String getOrderStatus() {
        return "Order Placed";
    }

    // Display order information.
    void displayStatus() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}
