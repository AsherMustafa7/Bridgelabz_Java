
/*
 * Question:
 * Develop a university course management system supporting
 * Exam-Based, Assignment-Based, and Research-Based courses.
 *
 * Hint:
 * Create an abstract CourseType class and its subclasses.
 * Use Course<T extends CourseType> to manage each course type.
 * Use List<? extends CourseType> to display different course types.
 *
 * Author: Asher Mustafa
 * Date: 20 - 10 - 2026
 */

package JavaGenerics.AssignmentsOfJavaGenerics.UniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Common abstract class for course evaluation types.
abstract class CourseType {
    private String evaluationName;

    public CourseType(String evaluationName) {
        this.evaluationName = evaluationName;
    }

    public String getEvaluationName() {
        return evaluationName;
    }

    // Each course type provides its own evaluation details.
    public abstract void displayEvaluation();
}

// Course evaluated through examinations.
class ExamCourse extends CourseType {
    private int examCount;

    public ExamCourse(int examCount) {
        super("Exam-Based");
        this.examCount = examCount;
    }

    @Override
    public void displayEvaluation() {
        System.out.println("Evaluation: " + getEvaluationName());
        System.out.println("Number of exams: " + examCount);
    }
}

// Course evaluated through assignments.
class AssignmentCourse extends CourseType {
    private int assignmentCount;

    public AssignmentCourse(int assignmentCount) {
        super("Assignment-Based");
        this.assignmentCount = assignmentCount;
    }

    @Override
    public void displayEvaluation() {
        System.out.println("Evaluation: " + getEvaluationName());
        System.out.println("Number of assignments: " + assignmentCount);
    }
}

// Course evaluated through research.
class ResearchCourse extends CourseType {
    private String researchTopic;

    public ResearchCourse(String researchTopic) {
        super("Research-Based");
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayEvaluation() {
        System.out.println("Evaluation: " + getEvaluationName());
        System.out.println("Research topic: " + researchTopic);
    }
}

// T must be a valid CourseType.
class Course<T extends CourseType> {
    private int courseId;
    private String courseName;
    private String department;
    private T courseType;

    public Course(int courseId, String courseName,
                  String department, T courseType) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.department = department;
        this.courseType = courseType;
    }

    public void display() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Department: " + department);

        // Display evaluation details using polymorphism.
        courseType.displayEvaluation();
    }
}

public class UniversityCourseManagementSystem {

    // Accept a list containing any subtype of CourseType.
    public static void displayCourseTypes(
            List<? extends CourseType> types) {

        for (CourseType type : types) {
            type.displayEvaluation();
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create courses with different evaluation types.
        Course<ExamCourse> c1 = new Course<>(
                101, "Data Structures", "CSE",
                new ExamCourse(3));

        Course<AssignmentCourse> c2 = new Course<>(
                102, "Web Development", "IT",
                new AssignmentCourse(5));

        Course<ResearchCourse> c3 = new Course<>(
                103, "Artificial Intelligence", "CSE",
                new ResearchCourse("Machine Learning"));

        // Display complete course information.
        System.out.println("University Courses:\n");

        c1.display();
        System.out.println();

        c2.display();
        System.out.println();

        c3.display();

        // Collect course types in a common list.
        List<CourseType> types = new ArrayList<>();
        types.add(new ExamCourse(2));
        types.add(new AssignmentCourse(4));
        types.add(new ResearchCourse("Natural Language Processing"));

        // Display all evaluation types through a wildcard method.
        System.out.println("\nAll Evaluation Types:\n");
        displayCourseTypes(types);
    }
}
