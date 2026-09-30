package JavaConstructor.Extras;
/*
 * Question:
 * Online Course Management: Create Course with instance variables courseName, duration, fee, class variable instituteName, instance method displayCourseDetails(), and class method updateInstituteName().
 *
 * Hint:
 * Use static for instituteName because it is shared. Use a static method to update it for all Course objects.
 *
 * Author: Asher Mustafa
 * Date: 30 - 09 - 2026
 */

public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Java Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 25000.0);
        Course c2 = new Course("Python", 4, 20000.0);
        c1.displayCourseDetails();
        Course.updateInstituteName("Tech Academy");
        c2.displayCourseDetails();
        c1.displayCourseDetails();
    }
}
