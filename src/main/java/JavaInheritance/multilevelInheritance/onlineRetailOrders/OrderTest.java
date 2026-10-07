/*
 * Sample Problem 1: Demonstrate multilevel inheritance using DeliveredOrder.
 *
 * Hint:
 * DeliveredOrder inherits from ShippedOrder and indirectly from Order.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.multilevelInheritance.onlineRetailOrders;

class OrderTest {
    public static void main(String[] args) {
        // Create the third-level object.
        DeliveredOrder order = new DeliveredOrder(5001, "07-10-2026", "TRK12345", "10-10-2026");

        // Display inherited and overridden behavior.
        order.displayStatus();
    }
}
