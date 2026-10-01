package javaStatics.level1;

/*
 * Question:
 * Create a Patient class with the following features:
 * 1. Static:
 *    - A static variable hospitalName shared among all patients.
 *    - A static method getTotalPatients() to count the total patients admitted.
 * 2. This:
 *    - Use this to initialize name, age, and ailment in the constructor.
 * 3. Final:
 *    - Use a final variable patientID to uniquely identify each patient.
 * 4. Instanceof:
 *    - Check if an object is an instance of the Patient class before displaying its details.
 *
 * Author: Asher Mustafa
 * Date: 01 - 10 - 2026
 */

public class Patient {
    static String hospitalName = "ABC Hospital";
    static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Patient ID: " + patientID);
    }

    public static void main(String[] args) {
        // Create a Patient object.
        Patient patient = new Patient("Asher", 21, "Fever", 101);

        // Check whether the object is an instance of Patient.
        if (patient instanceof Patient) {
            patient.displayDetails();
        }

        // Display the total number of patients.
        Patient.getTotalPatients();
    }
}
