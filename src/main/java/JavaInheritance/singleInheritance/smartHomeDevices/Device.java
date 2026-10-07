/*
 * Sample Problem 2: Smart Home Devices. Define Device with deviceId, status, and displayStatus().
 *
 * Hint:
 * Keep common device information in Device.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.singleInheritance.smartHomeDevices;

class Device {
    private String deviceId;
    private String status;

    // Initialize common device information.
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Display common device status.
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}
