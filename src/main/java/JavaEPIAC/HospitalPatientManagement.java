/*
 * Problem 7: Hospital Patient Management
Design a hospital patient management system using an abstract Patient class.
Patient must contain patientId, name, and age.
Provide an abstract calculateBill() method and a concrete getPatientDetails() method.
Create InPatient and OutPatient subclasses with different billing logic.
Create a MedicalRecord interface with addRecord() and viewRecords().
Use encapsulation to protect sensitive medical history and polymorphism to display billing details dynamically.
 *
 * Hint:
 * Keep common patient data and billing structure in Patient. Let each patient type calculate its bill. Keep medical records private and expose controlled methods.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaEPIAC;

import java.util.ArrayList;

// Define medical record behavior.
interface MedicalRecord {
    // Add a medical record.
    void addRecord(String record);

    // Display medical records.
    void viewRecords();
}

// Define the common patient structure.
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    // Initialize common patient information.
    Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = Math.max(age, 0);
    }

    // Return the patient ID.
    public int getPatientId() {
        return patientId;
    }

    // Return the patient name.
    public String getName() {
        return name;
    }

    // Return the patient age.
    public int getAge() {
        return age;
    }

    // Require subclasses to calculate their own bills.
    public abstract double calculateBill();

    // Display patient information and the calculated bill.
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Bill: " + calculateBill());
    }
}

// Represent an inpatient.
class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private double treatmentCharge;
    private ArrayList<String> medicalHistory = new ArrayList<>();

    // Initialize inpatient billing information.
    InPatient(int patientId, String name, int age, double roomCharge, double treatmentCharge) {
        super(patientId, name, age);
        this.roomCharge = Math.max(roomCharge, 0);
        this.treatmentCharge = Math.max(treatmentCharge, 0);
    }

    // Calculate the inpatient bill.
    @Override
    public double calculateBill() {
        return roomCharge + treatmentCharge;
    }

    // Add a valid medical record.
    @Override
    public void addRecord(String record) {
        if (record != null && !record.trim().isEmpty()) {
            medicalHistory.add(record);
        }
    }

    // Display medical records without exposing the internal list.
    @Override
    public void viewRecords() {
        for (String record : medicalHistory) {
            System.out.println(record);
        }
    }
}

// Represent an outpatient.
class OutPatient extends Patient implements MedicalRecord {
    private double consultationCharge;
    private double testCharge;
    private ArrayList<String> medicalHistory = new ArrayList<>();

    // Initialize outpatient billing information.
    OutPatient(int patientId, String name, int age, double consultationCharge, double testCharge) {
        super(patientId, name, age);
        this.consultationCharge = Math.max(consultationCharge, 0);
        this.testCharge = Math.max(testCharge, 0);
    }

    // Calculate the outpatient bill.
    @Override
    public double calculateBill() {
        return consultationCharge + testCharge;
    }

    // Add a valid medical record.
    @Override
    public void addRecord(String record) {
        if (record != null && !record.trim().isEmpty()) {
            medicalHistory.add(record);
        }
    }

    // Display medical records without exposing the internal list.
    @Override
    public void viewRecords() {
        for (String record : medicalHistory) {
            System.out.println(record);
        }
    }
}

// Test patient processing polymorphically.
class HospitalPatientManagement {
    public static void main(String[] args) {
        // Create a list of Patient references.
        ArrayList<Patient> patients = new ArrayList<>();

        // Create different patient types.
        InPatient inPatient = new InPatient(101, "Arun", 45, 8000, 12000);
        OutPatient outPatient = new OutPatient(102, "Meera", 30, 1000, 2500);

        // Add records through the MedicalRecord interface.
        inPatient.addRecord("Admission completed.");
        outPatient.addRecord("Consultation completed.");

        // Add both patient types to the same list.
        patients.add(inPatient);
        patients.add(outPatient);

        // Process both patient types polymorphically.
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println();
        }

        // View records through the interface.
        MedicalRecord record = inPatient;
        System.out.println("Medical Records:");
        record.viewRecords();
    }
}
