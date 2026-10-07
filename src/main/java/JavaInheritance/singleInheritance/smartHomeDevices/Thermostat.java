/*
 * Sample Problem 2: Create Thermostat as a subclass of Device with temperatureSetting.
 *
 * Hint:
 * Extend Device and override displayStatus().
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.singleInheritance.smartHomeDevices;

class Thermostat extends Device {
    private double temperatureSetting;

    // Initialize inherited and thermostat data.
    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Display device and thermostat settings.
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
    }
}
