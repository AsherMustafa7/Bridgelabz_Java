
/*
 * Question:
 * Develop a resume screening system for Software Engineers,
 * Data Scientists, and Product Managers while maintaining type safety.
 *
 * Hint:
 * Create an abstract JobRole class and its subclasses.
 * Use Resume<T extends JobRole> to associate a resume with a role.
 * Use List<? extends JobRole> to process different job roles.
 *
 * Author: Asher Mustafa
 * Date: 20 - 10 - 2026
 */

package JavaGenerics.AssignmentsOfJavaGenerics.AIResumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

// Common abstract class for all job roles.
abstract class JobRole {
    private String roleName;
    private String requiredSkill;

    public JobRole(String roleName, String requiredSkill) {
        this.roleName = roleName;
        this.requiredSkill = requiredSkill;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getRequiredSkill() {
        return requiredSkill;
    }
}

// Software Engineer role.
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer", "Java");
    }
}

// Data Scientist role.
class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist", "Python");
    }
}

// Product Manager role.
class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager", "Communication");
    }
}

// T must be a JobRole or one of its subclasses.
class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;
    private List<String> skills;
    private int experienceYears;

    public Resume(String candidateName, T jobRole,
                  List<String> skills, int experienceYears) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
        this.skills = skills;
        this.experienceYears = experienceYears;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public T getJobRole() {
        return jobRole;
    }

    public List<String> getSkills() {
        return skills;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void display() {
        System.out.println("Candidate: " + candidateName);
        System.out.println("Applied Role: " + jobRole.getRoleName());
        System.out.println("Skills: " + skills);
        System.out.println("Experience: " + experienceYears + " years");
    }
}

public class AIResumeScreeningSystem {

    // Generic method to screen a resume for its associated job role.
    public static <T extends JobRole> void screenResume(Resume<T> resume) {

        // Start the candidate with a score of zero.
        int score = 0;

        // Check whether the candidate has the role's required skill.
        if (resume.getSkills().stream()
                .anyMatch(skill -> skill.equalsIgnoreCase(
                        resume.getJobRole().getRequiredSkill()))) {
            score += 60;
        }

        // Award experience points, capped at 40.
        score += Math.min(resume.getExperienceYears() * 10, 40);

        // Display the screening result.
        System.out.println("Candidate: " + resume.getCandidateName());
        System.out.println("Role: " + resume.getJobRole().getRoleName());
        System.out.println("Screening Score: " + score + "/100");

        // Apply a simple screening threshold.
        if (score >= 60) {
            System.out.println("Result: Shortlisted");
        } else {
            System.out.println("Result: Further Review Required");
        }

        System.out.println();
    }

    // Accept any list of job role subclasses.
    public static void displayJobRoles(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Role: " + role.getRoleName());
            System.out.println("Required Skill: "
                    + role.getRequiredSkill());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create resumes with skills and experience.
        Resume<SoftwareEngineer> r1 = new Resume<>(
                "Candidate A",
                new SoftwareEngineer(),
                List.of("Java", "SQL", "HTML"),
                3);

        Resume<DataScientist> r2 = new Resume<>(
                "Candidate B",
                new DataScientist(),
                List.of("Python", "Pandas", "Machine Learning"),
                2);

        Resume<ProductManager> r3 = new Resume<>(
                "Candidate C",
                new ProductManager(),
                List.of("Communication", "Planning", "Leadership"),
                1);

        // Screen each resume using the generic method.
        System.out.println("Resume Screening Results:\n");

        screenResume(r1);
        screenResume(r2);
        screenResume(r3);

        // Create a list containing different job role types.
        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        // Display all roles using the wildcard method.
        System.out.println("Available Job Roles:\n");
        displayJobRoles(roles);
    }
}
