/*
 * Sample Problem 2: Demonstrate multilevel inheritance using PaidOnlineCourse.
 *
 * Hint:
 * PaidOnlineCourse inherits from OnlineCourse and Course.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.multilevelInheritance.educationalCourses;

class CourseTest {
    public static void main(String[] args) {
        // Create the third-level course object.
        PaidOnlineCourse course = new PaidOnlineCourse("Java Programming", 40, "Online Academy", true, 5000, 20);

        // Display inherited and unique course information.
        course.displayCourse();
    }
}
