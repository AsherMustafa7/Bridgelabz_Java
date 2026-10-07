/*
 * Sample Problem 2: Educational Course Hierarchy. Define Course with courseName and duration.
 *
 * Hint:
 * Keep common course information at the first level.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.multilevelInheritance.educationalCourses;

class Course {
    private String courseName;
    private int duration;

    // Initialize common course data.
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Display common course data.
    void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}
