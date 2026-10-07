/*
 * Sample Problem 1: Demonstrate Chef and Waiter using Person inheritance and Worker interface.
 *
 * Hint:
 * Both objects are Persons and Workers.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hybridInheritance.restaurantManagement;

class RestaurantTest {
    public static void main(String[] args) {
        // Create objects that extend Person and implement Worker.
        Chef chef = new Chef("Vikram", 201);
        Waiter waiter = new Waiter("Anita", 202);

        // Use inherited behavior.
        chef.displayPerson();
        waiter.displayPerson();

        // Use interface behavior.
        chef.performDuties();
        waiter.performDuties();
    }
}
