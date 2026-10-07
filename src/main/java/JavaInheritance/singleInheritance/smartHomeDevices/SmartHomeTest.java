/*
 * Sample Problem 2: Create a Thermostat object and display its current settings.
 *
 * Hint:
 * Use the subclass object to access inherited and unique behavior.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.singleInheritance.smartHomeDevices;

class SmartHomeTest {
    public static void main(String[] args) {
        // Create a thermostat object.
        Thermostat thermostat = new Thermostat("TH101", "ON", 24.5);

        // Display all thermostat information.
        thermostat.displayStatus();
    }
}
