/*
 * Question:
 * Model a Hospital where Doctor and Patient objects interact through
 * consultations. A Doctor can see multiple Patients, and each Patient
 * can consult multiple Doctors.
 *
 * Tasks:
 * Define Hospital, Doctor, and Patient classes.
 * Create consult in Doctor to show communication between objects.
 * Model association between Doctors and Patients.
 *
 * Goal:
 * Practice creating an association with communication between objects.
 *
 * Hint:
 * Keep Doctor and Patient as independent objects.
 * Store relationships using ArrayList.
 * Let Doctor.consult accept a Patient and display the consultation.
 *
 * Author: Asher Mustafa
 * Date: 04 - 10 - 2026
 */
package ObjectRelationshipsAndCommunication.selfProblems.hospitalDoctorsPatients;
import java.util.ArrayList;

class Doctor {
    // Store the doctor name.
    private String name;
    // Store Patients associated with this Doctor.
    private ArrayList<Patient> patients;

    // Create a Doctor with the given name.
    Doctor(String name) {
        // Assign the doctor name.
        this.name = name;
        // Create the Patient list.
        patients = new ArrayList<>();
    }

    // Consult a Patient and communicate with the Patient object.
    void consult(Patient patient) {
        // Add the Patient to this Doctor relationship.
        patients.add(patient);
        // Add this Doctor to the Patient relationship.
        patient.addDoctor(this);
        // Display the consultation between Doctor and Patient.
        System.out.println("Dr. " + name + " is consulting " + patient.getName());
    }

    // Return the doctor name.
    String getName() {
        // Return the stored doctor name.
        return name;
    }
}
