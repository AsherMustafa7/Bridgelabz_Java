/*
 * Sample Problem 1: Create Waiter extending Person and implementing Worker.
 *
 * Hint:
 * Extend Person and implement performDuties().
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hybridInheritance.restaurantManagement;

class Waiter extends Person implements Worker {
    // Initialize inherited Person data.
    Waiter(String name, int id) {
        super(name, id);
    }

    // Implement the Worker behavior.
    @Override
    public void performDuties() {
        System.out.println(name + " serves customers.");
    }
}
