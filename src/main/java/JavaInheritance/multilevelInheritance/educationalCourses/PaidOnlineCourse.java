/*
 * Sample Problem 2: Create PaidOnlineCourse with fee and discount.
 *
 * Hint:
 * Extend OnlineCourse to create the third level.
 *
 * Author: Asher Mustafa
 * Date: 07 - 10 - 2026
 */
package JavaInheritance.multilevelInheritance.educationalCourses;

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    // Initialize all three levels of course data.
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Display all course information.
    @Override
    void displayCourse() {
        super.displayCourse();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
    }
}
