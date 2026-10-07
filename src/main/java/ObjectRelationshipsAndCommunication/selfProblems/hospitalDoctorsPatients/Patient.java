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

class Patient {
    // Store the patient name.
    private String name;
    // Store Doctors associated with this Patient.
    private ArrayList<Doctor> doctors;

    // Create a Patient with the given name.
    Patient(String name) {
        // Assign the patient name.
        this.name = name;
        // Create the Doctor list.
        doctors = new ArrayList<>();
    }

    // Add a Doctor to this Patient relationship.
    void addDoctor(Doctor doctor) {
        // Add the Doctor to the Patient list.
        doctors.add(doctor);
    }

    // Return the patient name.
    String getName() {
        // Return the stored patient name.
        return name;
    }
}
