/*
 * Sample Problem 1: Create Chef extending Person and implementing Worker.
 *
 * Hint:
 * Extend Person and implement performDuties().
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.hybridInheritance.restaurantManagement;

class Chef extends Person implements Worker {
    // Initialize inherited Person data.
    Chef(String name, int id) {
        super(name, id);
    }

    // Implement the Worker behavior.
    @Override
    public void performDuties() {
        System.out.println(name + " prepares food.");
    }
}
