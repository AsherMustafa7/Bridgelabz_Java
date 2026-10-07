/*
 * Sample Problem 2: Create OnlineCourse with platform and isRecorded.
 *
 * Hint:
 * Extend Course and add online-course-specific data.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.multilevelInheritance.educationalCourses;

class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    // Initialize inherited and online-course data.
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Display inherited and online-course data.
    @Override
    void displayCourse() {
        super.displayCourse();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}
