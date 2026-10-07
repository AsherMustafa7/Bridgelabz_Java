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

class Hospital {
    // Store the hospital name.
    private String name;
    // Store Doctor objects associated with the Hospital.
    private ArrayList<Doctor> doctors;
    // Store Patient objects associated with the Hospital.
    private ArrayList<Patient> patients;

    // Create a Hospital with the given name.
    Hospital(String name) {
        // Assign the hospital name.
        this.name = name;
        // Create the Doctor list.
        doctors = new ArrayList<>();
        // Create the Patient list.
        patients = new ArrayList<>();
    }

    // Add a Doctor to the Hospital.
    void addDoctor(Doctor doctor) {
        // Add the existing Doctor object to the Hospital.
        doctors.add(doctor);
    }

    // Add a Patient to the Hospital.
    void addPatient(Patient patient) {
        // Add the existing Patient object to the Hospital.
        patients.add(patient);
    }

    // Return the hospital name.
    String getName() {
        // Return the stored hospital name.
        return name;
    }
}
